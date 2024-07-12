package complex;

import java.util.logging.Logger;

public class ProxyLoggingComplexOperation implements ComplexOperation {

    private static final Logger logger = Logger.getLogger(ProxyLoggingComplexOperation.class.getName());
    private final ComplexOperation complexOperation;

    public ProxyLoggingComplexOperation(ComplexOperation complexOperation) {
        this.complexOperation = complexOperation;
    }

    @Override
    public ComplexNumber operate(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = complexOperation.operate(a, b);
        logger.info("Operation: " + complexOperation.getClass().getSimpleName() +
                ", a: " + a + ", b: " + b + ", result: " + result);
        return result;
    }
}
