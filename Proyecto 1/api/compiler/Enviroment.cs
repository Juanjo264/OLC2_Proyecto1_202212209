public class Environment {
  public Dictionary<string, ValueWrapper> variables = new Dictionary<string, ValueWrapper>();

private Environment? parent;

public Environment (Environment? parent ) {

    this.parent = parent;

}

  public ValueWrapper GetVariable(string id) {
    if (variables.ContainsKey(id)) {
      return variables[id];
    }
    if (parent != null) {
      return parent.GetVariable(id);
    }
    throw new Exception("Variable " + id + " not found");
  }

public void DeclareVariable(string id, ValueWrapper value, Type tipoEsperado = null) {
    if (variables.ContainsKey(id)) {
        throw new Exception("Error: La variable " + id + " ya ha sido declarada.");
    }

    if (tipoEsperado != null && tipoEsperado != typeof(SliceValue)) {
        if (value is SliceValue slice) {
            if (slice.Values.Count > 0 && slice.Values[0].GetType() != tipoEsperado) {
                throw new Exception("Error: Los elementos del slice no coinciden con el tipo declarado para " + id);
            }
        } else if (value != null && value.GetType() != tipoEsperado) {
            throw new Exception("Error: El valor no coincide con el tipo declarado para " + id);
        }
    }

    if (value == null && tipoEsperado == typeof(SliceValue)) {
        value = new SliceValue(new List<ValueWrapper>());
    }

    variables[id] = value ?? GetDefaultValue(tipoEsperado);
}


private ValueWrapper GetDefaultValue(Type tipoEsperado) {
    if (tipoEsperado == typeof(IntValue)) {
        return new IntValue(0);
    } else if (tipoEsperado == typeof(FloatValue)) {
        return new FloatValue((float)0.0);
    } else if (tipoEsperado == typeof(BoolValue)) {
        return new BoolValue(false);
    } else if (tipoEsperado == typeof(StringValue)) {
        return new StringValue("");
    } else if (tipoEsperado == typeof(RuneValue)) {
        return new RuneValue('\0');
    }
     else {
        throw new Exception("Error: Tipo desconocido " + tipoEsperado);
    }
}

public void AssignVariable(string id, ValueWrapper value) {
    if (variables.ContainsKey(id)) {
        ValueWrapper valorAntiguo = variables[id];

        if (valorAntiguo is SliceValue oldSlice && value is SliceValue newSlice) {
            if (oldSlice.Values.Count == 0) {
                variables[id] = value;
                return;
            }

            Type tipoSliceViejo = oldSlice.Values.Count > 0 ? oldSlice.Values[0].GetType() : null;
            Type tipoSliceNuevo = newSlice.Values.Count > 0 ? newSlice.Values[0].GetType() : null;

            if (tipoSliceViejo != null && tipoSliceNuevo != null && tipoSliceViejo != tipoSliceNuevo) {
                throw new Exception("Error: No se puede asignar un slice de "+ tipoSliceNuevo + " a un slice de " + tipoSliceViejo);
            }

            variables[id] = value;
            return;
        }
        if (valorAntiguo.GetType() == value.GetType() || 
            (valorAntiguo is FloatValue && value is IntValue)) {
            variables[id] = value;
        } else {
            throw new Exception("Error: No se puede cambiar el tipo de la variable " + id);
        }
        return;
    }

    if (parent != null) {
        parent.AssignVariable(id, value);
        return;
    }

    throw new Exception("Error: La variable " + id + " no ha sido declarada.");
}

}