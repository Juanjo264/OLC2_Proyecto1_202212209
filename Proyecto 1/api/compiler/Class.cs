using System.Runtime.CompilerServices;
using analyzer;

public class LanguageClass : Invocable
{
    public string Name { get; set; }
    public Dictionary<string, LanguageParser.DeclaracionVarContext> Props { get; set; }
    public Dictionary<string, ForeignFunction> Methods { get; set; }
    public string MainProperty { get; private set; } = ""; // Nueva variable para propiedad principal

    public LanguageClass(string name, 
        Dictionary<string, LanguageParser.DeclaracionVarContext> props,
        Dictionary<string, ForeignFunction> methods)
    {
        Name = name;
        Props = props;
        Methods = methods;

        // Identificar propiedad principal de tipo int o float
        foreach (var prop in Props)
        {
            if (prop.Value.tipo().GetText() == "int" || prop.Value.tipo().GetText() == "float")
            {
                MainProperty = prop.Key;
                break;
            }
        }
    }

    public ForeignFunction? GetMethod(string name)
    {
        if (Methods.ContainsKey(name))
        {
            return Methods[name];
        }
        return null;
    }

    public int Arity()
    {
        var constructor = GetMethod("constructor");
        if (constructor != null)
        {
            return constructor.Arity();
        }
        return 0;
    }

    public ValueWrapper Invoke(List<ValueWrapper> args, CompilerVisitor visitor)
    {
        var newInstance = new Instance(this, MainProperty); // Pasamos la propiedad principal
        
        foreach (var prop in Props)
        {
            var name = prop.Key;
            var value = prop.Value;
            if (value.expr() != null)
            {
                var varValue = visitor.Visit(value.expr());
                newInstance.Set(name, varValue);
            }
            else
            {
                newInstance.Set(name, visitor.defaultValue);
            }
        }

        var constructor = GetMethod("constructor");
        Console.WriteLine(constructor);
        if (constructor != null)
        {
            constructor.Bind(newInstance).Invoke(args, visitor);
        }
        return new InstanceValue(newInstance);
    }
}
