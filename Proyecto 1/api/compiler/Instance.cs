public class Instance {
    private LanguageClass languageClass;
    private Dictionary<string, ValueWrapper> Properties;
    private string mainProperty; // Propiedad principal de la instancia

    public Instance(LanguageClass languageClass, string mainProperty = "") {
        this.languageClass = languageClass;
        this.mainProperty = mainProperty;
        Properties = new Dictionary<string, ValueWrapper>();
    }

    public void Set(string name, ValueWrapper value) {
        Properties[name] = value;
    }

    public ValueWrapper Get(string name, Antlr4.Runtime.IToken token) {
        if (Properties.ContainsKey(name)) {
            return Properties[name];
        }

        var method = languageClass.GetMethod(name);
        if (method != null) {
            return new FunctionValue(languageClass.Methods[name].Bind(this), name);
        }

        throw new SemanticError("Propiedad " + name + " no encontrada", token);
    }

    public ValueWrapper GetMainProperty() {
        if (!string.IsNullOrEmpty(mainProperty) && Properties.ContainsKey(mainProperty)) {
            return Properties[mainProperty]; // Retorna la propiedad principal
        }
        return new InstanceValue(this); // Si no hay propiedad principal, retorna la instancia misma
    }

    public LanguageClass GetClass() {
        return languageClass;
    }
}
