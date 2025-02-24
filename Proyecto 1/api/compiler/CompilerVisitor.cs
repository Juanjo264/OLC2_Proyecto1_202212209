



using analyzer;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;

public class CompilerVisitor : LanguageBaseVisitor<ValueWrapper>{

private Environment currentEnvironment = new Environment(null);
private ValueWrapper defaultValue = new VoidValue();
public string output = "";


//visitprogram
    public override ValueWrapper VisitProgram(LanguageParser.ProgramContext context)
    {
        foreach (var declaracion in context.listainstrucciones()) {
            Visit(declaracion);
        }   
      
      return defaultValue;
    }

//visitarExprecionInstruccion
    public override ValueWrapper VisitExprecionInstruccion( LanguageParser.ExprecionInstruccionContext context)
    {
        return Visit(context.expr());
    }


//visitprint

    public override ValueWrapper VisitImpresiones(LanguageParser.ImpresionesContext context)
    {

        ValueWrapper valor = Visit(context.expr());
        output += valor switch
        {   
            IntValue i => i.Value.ToString(),
            FloatValue f => f.Value.ToString(),
            StringValue s => s.Value,
            BoolValue b => b.Value.ToString(),
            RuneValue r => r.Value.ToString(),
            SliceValue slice => slice.ToString(), 
            _ => throw new Exception("Tipo de dato no válido")
        };
        output += "\n";
        return defaultValue;
    }

//visitid
    public override ValueWrapper VisitIdexpresion(LanguageParser.IdexpresionContext context)
    {
        string id = context.ID().GetText();
        return currentEnvironment.GetVariable(id);
    }

//parens
    public override ValueWrapper VisitParens(LanguageParser.ParensContext context)
    {
      Console.WriteLine("Parens");
      return Visit(context.expr());
    }

//corchete

    public override ValueWrapper VisitCorchetes(LanguageParser.CorchetesContext context)
    {
        Console.WriteLine("corchete");

        return Visit(context.expr());
    }

//Negate
    public override ValueWrapper VisitNegate( LanguageParser.NegateContext context) {
    ValueWrapper valor = Visit(context.expr());

    return valor switch {
        IntValue i => new IntValue(-i.Value),
        FloatValue f => new FloatValue(-f.Value),
        _ => throw new Exception("Operación de negación no válida")
    };
}

    
//INT
    public override ValueWrapper VisitInt(LanguageParser.IntContext context)
    {
      return new IntValue(int.Parse(context.INT().GetText()));
    }

//mulDiv
    public override ValueWrapper VisitMulDiv(LanguageParser.MulDivContext context)
    {
        ValueWrapper left = Visit(context.expr(0));
        ValueWrapper right = Visit(context.expr(1));
        var op = context.op.Text;

        return(left, right, op) switch {
            (IntValue l, IntValue r, "*") => new IntValue(l.Value * r.Value),
            (IntValue l, IntValue r, "/") => new IntValue(l.Value / r.Value),
            (IntValue l, FloatValue r, "*") => new FloatValue(l.Value * r.Value),
            (IntValue l, FloatValue r, "/") => new FloatValue(l.Value / r.Value),
            (FloatValue l, IntValue r, "*") => new FloatValue(l.Value * r.Value),
            (FloatValue l, IntValue r, "/") => new FloatValue(l.Value / r.Value),
            (FloatValue l, FloatValue r, "*") => new FloatValue(l.Value * r.Value),
            (FloatValue l, FloatValue r, "/") => new FloatValue(l.Value / r.Value),
            _ => throw new Exception("Operación de multiplicación o división no válida entre tipos: " + left.GetType() + " y " + right.GetType())
        };


    }

//addSub
public override ValueWrapper VisitAddSub(LanguageParser.AddSubContext context)
{
    ValueWrapper left = Visit(context.expr(0));
    ValueWrapper right = Visit(context.expr(1));
    var op = context.op.Text;

    return (left, right, op) switch {
        (IntValue l, IntValue r, "+") => new IntValue(l.Value + r.Value),
        (IntValue l, FloatValue r, "+") => new FloatValue(l.Value + r.Value),
        (FloatValue l, IntValue r, "+") => new FloatValue(l.Value + r.Value),
        (FloatValue l, FloatValue r, "+") => new FloatValue(l.Value + r.Value),
        (StringValue l, StringValue r, "+") => new StringValue(l.Value + r.Value),
        (IntValue l, IntValue r, "-") => new IntValue(l.Value - r.Value),
        (IntValue l, FloatValue r, "-") => new FloatValue(l.Value - r.Value),
        (FloatValue l, IntValue r, "-") => new FloatValue(l.Value - r.Value),
        (FloatValue l, FloatValue r, "-") => new FloatValue(l.Value - r.Value),
        _ => throw new Exception("Operación de suma o resta no válida entre tipos: " + left.GetType() + " y " + right.GetType())
    };
}
//Mod
    public override ValueWrapper VisitMod(LanguageParser.ModContext context)
    {
        ValueWrapper left = Visit(context.expr(0));
        ValueWrapper right = Visit(context.expr(1));
        var op = context.op.Text;

        return (left, right, op) switch {
            (IntValue l, IntValue r, "%") => new IntValue(l.Value % r.Value),
            _ => throw new Exception("Operación de módulo no válida entre tipos: " + left.GetType() + " y " + right.GetType())
        };
    }

//addSubMORE
    public override ValueWrapper VisitIncremento(LanguageParser.IncrementoContext context)
    {
        string nombreVariable = context.ID().GetText();
        string signo = context.GetChild(1).GetText();
        ValueWrapper valor = Visit(context.expr());
            
        if (signo == "+=") { // Incremento
            if (valor is IntValue){
                try {
                    var valorAntiguo = currentEnvironment.GetVariable(nombreVariable);
                    Console.WriteLine("Variable " + nombreVariable + " valor antiguo: " + valorAntiguo + " nuevo valor: " + valor);
                    currentEnvironment.AssignVariable(nombreVariable, new IntValue(((IntValue)valorAntiguo).Value + ((IntValue)valor).Value));
                } catch (Exception) {
                    Console.WriteLine("Error: La variable " + nombreVariable + " no es del mismo tipo.");
                    return new BoolValue(false);
                }
                }
            else if (valor is FloatValue){
                try {
                    var valorAntiguo = currentEnvironment.GetVariable(nombreVariable);
                    Console.WriteLine("Variable " + nombreVariable + " valor antiguo: " + valorAntiguo + " nuevo valor: " + valor);
                    currentEnvironment.AssignVariable(nombreVariable, new FloatValue(((FloatValue)valorAntiguo).Value + ((FloatValue)valor).Value));
                } catch (Exception) {
                    Console.WriteLine("Error: La variable " + nombreVariable + " no es del mismo tipo.");
                    return new BoolValue(false);
                }
            }else if (valor is StringValue){
                try {
                    var valorAntiguo = currentEnvironment.GetVariable(nombreVariable);
                    Console.WriteLine("Variable " + nombreVariable + " valor antiguo: " + valorAntiguo + " nuevo valor: " + valor);
                    currentEnvironment.AssignVariable(nombreVariable, new StringValue(((StringValue)valorAntiguo).Value + ((StringValue)valor).Value));
                } catch (Exception) {
                    Console.WriteLine("Error: La variable " + nombreVariable + " no es del mismo tipo.");
                    return new BoolValue(false);
                }
            }
            
        }
        if (valor is IntValue){
            if (signo == "-=") {
                try {
                    var valorAntiguo = currentEnvironment.GetVariable(nombreVariable);
                    Console.WriteLine("Variable " + nombreVariable + " valor antiguo: " + valorAntiguo + " nuevo valor: " + valor);
                    currentEnvironment.AssignVariable(nombreVariable, new IntValue(((IntValue)valorAntiguo).Value - ((IntValue)valor).Value));
                } catch (Exception) {
                    Console.WriteLine("Error: La variable " + nombreVariable + " no es del mismo tipo.");
                    return new BoolValue(false);
                }
            }
        } else if (valor is FloatValue){
            if (signo == "-=") { 
                try {
                    var valorAntiguo = currentEnvironment.GetVariable(nombreVariable);
                    Console.WriteLine("Variable " + nombreVariable + " valor antiguo: " + valorAntiguo + " nuevo valor: " + valor);
                    currentEnvironment.AssignVariable(nombreVariable, new FloatValue(((FloatValue)valorAntiguo).Value - ((FloatValue)valor).Value));
                } catch (Exception) {
                    Console.WriteLine("Error: La variable " + nombreVariable + " no es del mismo tipo.");
                    return new BoolValue(false);
                }
            }
        } 
        return new BoolValue(true);
    }

    /* VARIABLES */

public override ValueWrapper VisitDeclaracionVar(LanguageParser.DeclaracionVarContext context) {
    string id = context.ID().GetText();
    string tipoStr = context.tipo().GetText(); // Obtenemos el tipo declarado
    Type tipoEsperado = ObtenerTipo(tipoStr); // Convertimos el string a un tipo

    ValueWrapper valor = null;
    if (context.expr() != null) {
        valor = Visit(context.expr());

        // Verificar si el valor coincide con el tipo esperado
        if (valor.GetType() != tipoEsperado) {
            throw new Exception("Error: El valor asignado no coincide con el tipo declarado para " + id);
        }
    }

    currentEnvironment.DeclareVariable(id, valor, tipoEsperado);
    return new BoolValue(true);
}
private Type ObtenerTipo(string tipo) {
    return tipo switch {
        "int" => typeof(IntValue),
        "float64" => typeof(FloatValue),
        "bool" => typeof(BoolValue),
        "string" => typeof(StringValue),
        "rune" => typeof(RuneValue),
        _ when tipo.StartsWith("[]") => typeof(SliceValue), 
        _ => throw new Exception("Error: Tipo no soportado: " + tipo)
    };
}

    /* ASIGNACION */
public override ValueWrapper VisitAsignarVar(LanguageParser.AsignarVarContext context) {
    string nombreVariable = context.ID().GetText();
    string signo = context.GetChild(1).GetText();
    ValueWrapper valor = Visit(context.expr());

    if (signo == ":=") { // Declaración implícita (inferir tipo)
        try {
            currentEnvironment.GetVariable(nombreVariable);
            throw new Exception("Error: La variable " + nombreVariable + " ya ha sido declarada.");
        } catch (Exception) {
            currentEnvironment.DeclareVariable(nombreVariable, valor, valor.GetType());
            Console.WriteLine("Variable declarada: " + nombreVariable + " valor: " + valor);
        }
    } else if (signo == "=") { // Asignación de nuevo valor
        try {
            var valorAntiguo = currentEnvironment.GetVariable(nombreVariable);
            Console.WriteLine("Variable " + nombreVariable + " valor antiguo: " + valorAntiguo + " nuevo valor: " + valor);
            currentEnvironment.AssignVariable(nombreVariable, valor);
        } catch (Exception) {
            throw new Exception("Error: La variable " + nombreVariable + " no ha sido declarada.");
        }
    }

    return new BoolValue(true);
}

     /* EXPRESIONES */

    public override ValueWrapper VisitFloat( LanguageParser.FloatContext context) {
        return new FloatValue(float.Parse(context.FLOAT().GetText()));
    }


    public override ValueWrapper VisitBoleanTrueExpresion(LanguageParser.BoleanTrueExpresionContext context) {
        return new BoolValue(bool.Parse(context.TRUE().GetText()));
    }

    public override ValueWrapper VisitBoleanFalseExpresion(LanguageParser.BoleanFalseExpresionContext context) {
        return new BoolValue(bool.Parse(context.FALSE().GetText()));
    }

    public override ValueWrapper VisitCadenaExpresion( LanguageParser.CadenaExpresionContext context) {
        string cadena = context.GetText();
        if (cadena.StartsWith("\"") && cadena.EndsWith("\"")) {
            cadena = cadena.Substring(1, cadena.Length - 2);
        }
        return new StringValue(cadena);
    }

//caracter
    public override ValueWrapper VisitCaracterExpresion(LanguageParser.CaracterExpresionContext context) {
        string texto = context.GetText(); // Extrae el texto de la regla CARACTER, e.g., "'A'"
        if (texto.Length != 3 || texto[0] != '\'' || texto[2] != '\'') {
            throw new Exception("Error: Caracter inválido " + texto);
        }

        char caracter = texto[1]; // Extrae el único carácter válido
        return new RuneValue(caracter);
    }


    public override ValueWrapper VisitOperadorNegacion( LanguageParser.OperadorNegacionContext context) {
        ValueWrapper valor = Visit(context.expr());
        
        return valor switch {
            BoolValue b => new BoolValue(!b.Value),  // Negación lógica
            IntValue i => new IntValue(-i.Value),    // Negación aritmética
            FloatValue f => new FloatValue(-f.Value),    
            _ => throw new Exception("Operación de negación no válida")
        };
    }

//relacionales
    public override ValueWrapper VisitRelational( LanguageParser.RelationalContext context) {

    ValueWrapper left = Visit(context.expr(0));
    ValueWrapper right = Visit(context.expr(1));
    var op = context.op.Text;

    return (left, right, op) switch {
        (IntValue l, IntValue r, "<") => new BoolValue(l.Value < r.Value),
        (IntValue l, IntValue r, "<=") => new BoolValue(l.Value <= r.Value),
        (IntValue l, IntValue r, ">") => new BoolValue(l.Value > r.Value),
        (IntValue l, IntValue r, ">=") => new BoolValue(l.Value >= r.Value),
        (FloatValue l, FloatValue r, "<") => new BoolValue(l.Value < r.Value),
        (FloatValue l, FloatValue r, "<=") => new BoolValue(l.Value <= r.Value),
        (FloatValue l, FloatValue r, ">") => new BoolValue(l.Value > r.Value),
        (FloatValue l, FloatValue r, ">=") => new BoolValue(l.Value >= r.Value),
        (IntValue l, FloatValue r, "<") => new BoolValue(l.Value < r.Value),
        (IntValue l, FloatValue r, "<=") => new BoolValue(l.Value <= r.Value),
        (IntValue l, FloatValue r, ">") => new BoolValue(l.Value > r.Value),
        (IntValue l, FloatValue r, ">=") => new BoolValue(l.Value >= r.Value),
        (FloatValue l, IntValue r, "<") => new BoolValue(l.Value < r.Value),
        (FloatValue l, IntValue r, "<=") => new BoolValue(l.Value <= r.Value),
        (FloatValue l, IntValue r, ">") => new BoolValue(l.Value > r.Value),
        (FloatValue l, IntValue r, ">=") => new BoolValue(l.Value >= r.Value),
        (RuneValue l, RuneValue r, "<") => new BoolValue(l.Value < r.Value),
        (RuneValue l, RuneValue r, "<=") => new BoolValue(l.Value <= r.Value),
        (RuneValue l, RuneValue r, ">") => new BoolValue(l.Value > r.Value),
        (RuneValue l, RuneValue r, ">=") => new BoolValue(l.Value >= r.Value),
        _ => throw new Exception("Operación relacional no válida entre tipos: " + left.GetType() + " y " + right.GetType())

        };
    }

// equalitys 
    public override ValueWrapper VisitEqualitys( LanguageParser.EqualitysContext context) {

    ValueWrapper left = Visit(context.expr(0));
    ValueWrapper right = Visit(context.expr(1));
    var op = context.op.Text;

    return (left, right, op) switch {
        (IntValue l, IntValue r, "==") => new BoolValue(l.Value == r.Value),
        (IntValue l, IntValue r, "!=") => new BoolValue(l.Value != r.Value),
        (FloatValue l, FloatValue r, "==") => new BoolValue(l.Value == r.Value),
        (FloatValue l, FloatValue r, "!=") => new BoolValue(l.Value != r.Value),
        (StringValue l, StringValue r, "==") => new BoolValue(l.Value == r.Value),
        (StringValue l, StringValue r, "!=") => new BoolValue(l.Value != r.Value),
        (RuneValue l, RuneValue r, "==") => new BoolValue(l.Value == r.Value),
        (RuneValue l, RuneValue r, "!=") => new BoolValue(l.Value != r.Value),
        _ => throw new Exception("Operación de igualdad o desigualdad no válida entre tipos: " + left.GetType() + " y " + right.GetType())
        };
    }

// logicos 
    public override ValueWrapper VisitLogicos( LanguageParser.LogicosContext context) {
        ValueWrapper left = Visit(context.expr(0));
        ValueWrapper right = Visit(context.expr(1));
        var op = context.op.Text;

        return (left, right, op) switch {
            (BoolValue l, BoolValue r, "&&") => new BoolValue(l.Value && r.Value),
            (BoolValue l, BoolValue r, "||") => new BoolValue(l.Value || r.Value),
            _ => throw new Exception("Operación lógica no válida entre tipos: " + left.GetType() + " y " + right.GetType())
        };
    }

//Visitblock
    public override ValueWrapper VisitBloqueInstrucciones(LanguageParser.BloqueInstruccionesContext context)
    {
        Environment previosEnvironment = currentEnvironment;
        currentEnvironment = new Environment(previosEnvironment);
        foreach (var instruccion in context.listainstrucciones()) {
            Visit(instruccion);
        }
        currentEnvironment = previosEnvironment;
        return defaultValue;
    }

//if 
    public override ValueWrapper VisitIfInstruccion(LanguageParser.IfInstruccionContext context)
    {
        ValueWrapper condicion = Visit(context.expr());
        if (condicion is not BoolValue) {
            throw new Exception("Error: La condición del if no es booleana");
        }

        if ((condicion as BoolValue).Value) {
            Visit(context.instruccion(0));
        } else if (context.instruccion().Length > 1) {
            Visit(context.instruccion(1));
        }

        return defaultValue;
    } 
//while 
    public override ValueWrapper VisitWhileInstruccion(LanguageParser.WhileInstruccionContext context)
    {
        ValueWrapper condicion = Visit(context.expr());
        if (condicion is not BoolValue) {
            throw new Exception("Error: La condición del while no es booleana");
        }

        while ((condicion as BoolValue).Value) {
            Visit(context.instruccion());
            condicion = Visit(context.expr());
            // if (condicion is not BoolValue) {
            //     throw new Exception("Error: La condición del while no es booleana");
            // }
        }

        return defaultValue;
    }

//switch
public override ValueWrapper VisitSwitchInstruccion(LanguageParser.SwitchInstruccionContext context) {
    ValueWrapper valorSwitch = Visit(context.expr()); 
    bool ejecutado = false;

    foreach (var caseCtx in context.cases()) {
        ValueWrapper caseValor = Visit(caseCtx.expr());

        if (valorSwitch.Equals(caseValor)) {
            Visit(caseCtx.listainstrucciones());
            ejecutado = true;
            break; 
        }
    }

    if (!ejecutado && context.defaultCase() != null) {
        Visit(context.defaultCase().listainstrucciones());
    }

    return new BoolValue(true); 
}
    //declaracionSlice
    public override ValueWrapper VisitDeclaracionSlice(LanguageParser.DeclaracionSliceContext context) {
        string id = context.ID().GetText();
        string tipoStr = context.tipo().GetText(); 
        Type tipoEsperado = ObtenerTipo(tipoStr); 

        List<ValueWrapper> elementos = new List<ValueWrapper>();

        foreach (var exprCtx in context.expr()) {
            ValueWrapper valor = Visit(exprCtx);
            
            if (valor.GetType() != tipoEsperado) {
                throw new Exception("Error: El elemento " +valor +" no coincide con el tipo " + tipoStr);
            }

            elementos.Add(valor);
        }

        currentEnvironment.DeclareVariable(id, new SliceValue(elementos));

        Console.WriteLine("Declarado slice " +id+ "con valores:" + string.Join(", ", elementos));
        return new BoolValue(true);
    }

    //declaracionslice vacio
    public override ValueWrapper VisitDeclaracionSlicevacio(LanguageParser.DeclaracionSlicevacioContext context) {
        string id = context.ID().GetText();
        string tipoStr = context.tipo().GetText(); 
        Type tipoEsperado = ObtenerTipo(tipoStr); 

        
        currentEnvironment.DeclareVariable(id, new SliceValue(new List<ValueWrapper>()), tipoEsperado);

        Console.WriteLine("Declarado slice vacío: " + id + " de tipo " + tipoStr);
        return new BoolValue(true);
    }


}

