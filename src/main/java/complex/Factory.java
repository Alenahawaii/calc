package complex;

import java.util.HashMap;

public class Factory {
    private static HashMap<String, ComplexOperation> operations = new HashMap<>();


    public static ComplexOperation setOperation(String operationType) {
        operations.put("addition", new ProxyLoggingComplexOperation(new Addition()));
        operations.put("multiplication", new ProxyLoggingComplexOperation(new Multiply()));
        operations.put("division", new ProxyLoggingComplexOperation(new Divide()));

        if (operations.get(operationType.toLowerCase()) != null) {
            return operations.get(operationType.toLowerCase());
        }
        throw new IllegalArgumentException("Операция не назначена: " + operationType);

    }
}

