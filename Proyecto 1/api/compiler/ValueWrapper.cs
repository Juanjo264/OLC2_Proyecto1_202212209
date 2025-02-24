public abstract record ValueWrapper ;

public record IntValue(int Value) : ValueWrapper;

public record FloatValue(float Value) : ValueWrapper;

public record StringValue(string Value) : ValueWrapper;

public record BoolValue(bool Value) : ValueWrapper;

public record RuneValue(char Value) : ValueWrapper;
public record VoidValue : ValueWrapper;

public record SliceValue : ValueWrapper {
    public List<ValueWrapper> Values { get; }

    public SliceValue(List<ValueWrapper> values) {
        Values = values;
    }

    public override string ToString() {
        if (Values.Count == 0) {
            return "[]"; // Slice vacío
        }

        return "[" + string.Join(", ", Values.Select(v => ObtenerValorComoString(v))) + "]";
    }
        private string ObtenerValorComoString(ValueWrapper value) {
        return value switch {
            IntValue i => i.Value.ToString(),
            FloatValue f => f.Value.ToString(),
            StringValue s => $"\"{s.Value}\"",
            BoolValue b => b.Value.ToString().ToLower(),
            RuneValue r => r.Value.ToString(), 
            SliceValue slice => slice.ToString(), 
            _ => throw new Exception("Tipo no soportado en slice")
        };
    }

}
