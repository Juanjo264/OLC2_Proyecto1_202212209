using System.Linq.Expressions;
using analyzer;
using Microsoft.AspNetCore.DataProtection.KeyManagement.Internal;

public class ForeignFunction : Invocable {
    private Environment closure;
    private LanguageParser.FuncdlcContext context;
    private Type tipoRetorno;
    private List<Type> tiposParametros = new List<Type>();

    public ForeignFunction(Environment closure, LanguageParser.FuncdlcContext context, Type tipoRetorno) {
        this.closure = closure;
        this.context = context;
        this.tipoRetorno = tipoRetorno;

        if (context.@params() != null) {
            foreach (var param in context.@params().param()) {
                tiposParametros.Add(CompilerVisitor.ObtenerTipo(param.tipo().GetText(), param.tipo().Start));
            }
        }
    }

    public int Arity() {
        return tiposParametros.Count;
    }

public ValueWrapper Invoke(List<ValueWrapper> args, CompilerVisitor visitor) {
    if (args.Count != tiposParametros.Count) {
        throw new SemanticError($"Error: Se esperaban {tiposParametros.Count} argumentos, pero se recibieron {args.Count}.", context.Start);
    }

    var newEnv = new Environment(closure);
    var beforeCallEnv = visitor.currentEnvironment;
    visitor.currentEnvironment = newEnv;

    bool hasReturned = false; 

    if (context.@params() != null) {
        for (int i = 0; i < context.@params().param().Length; i++) {
            var paramName = context.@params().param(i).ID().GetText();
            var expectedType = tiposParametros[i];

            if (args[i].GetType() != expectedType) {
                throw new SemanticError($"Error: Se esperaba un argumento de tipo {expectedType.Name} para '{paramName}', pero se recibió {args[i].GetType().Name}.", context.Start);
            }

            newEnv.DeclareVariable(paramName, args[i]);
        }
    }

    try {
        foreach (var statement in context.listainstrucciones()) {
            visitor.Visit(statement);
        }
    } catch (ReturnException e) {
        visitor.currentEnvironment = beforeCallEnv;
        hasReturned = true;  

        if (tipoRetorno != typeof(VoidValue) && e.Value.GetType() != tipoRetorno) {
            throw new SemanticError($"Error: La función debe retornar {tipoRetorno.Name}, pero dio {e.Value.GetType().Name}.", context.Start);
        }

        return e.Value;
    }

    visitor.currentEnvironment = beforeCallEnv;

    if (!hasReturned && tipoRetorno != typeof(VoidValue)) {
        throw new SemanticError($"Error: La función {context.ID().GetText()} debe retornar {tipoRetorno.Name}, pero no tiene return", context.Start);
    }

    return visitor.defaultValue;
}

    public ForeignFunction Bind(Instance instance) {
        var hiddenEnv = new Environment(closure);
        hiddenEnv.DeclareVariable("this", new InstanceValue(instance), null);
        return new ForeignFunction(hiddenEnv, context, tipoRetorno);
    }


    public static ValueWrapper ObtenerValorPorDefecto(Type tipo) {
    return tipo switch {
        Type t when t == typeof(IntValue) => new IntValue(0),
        Type t when t == typeof(FloatValue) => new FloatValue(0.0f),
        Type t when t == typeof(BoolValue) => new BoolValue(false),
        Type t when t == typeof(StringValue) => new StringValue(""),
        Type t when t == typeof(RuneValue) => new RuneValue('\0'),
        Type t when t == typeof(SliceValue) => new SliceValue(new List<ValueWrapper>()),
        _ => throw new SemanticError($"Error: No se puede determinar un valor por defecto para el tipo {tipo.Name}.", null)
    };
}

}
