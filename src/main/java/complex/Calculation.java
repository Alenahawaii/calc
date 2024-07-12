package complex;

public class Calculation {

    private ComplexOperation operation;

    public void setOperation(ComplexOperation operation) {
        this.operation = operation;
    }

    public ComplexNumber doOperation(ComplexNumber a, ComplexNumber b) {
        if (operation == null) {
            throw new IllegalStateException("Операция не назначена");
        }
        return operation.operate(a, b);
    }

    public static void main(String[] args) {
        Calculation calculator = new Calculation();

        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(3, 4);

        calculator.setOperation(Factory.setOperation("addition"));
        ComplexNumber sum = calculator.doOperation(a, b);

        calculator.setOperation(Factory.setOperation("multiplication"));
        ComplexNumber product = calculator.doOperation(a, b);

        calculator.setOperation(Factory.setOperation("division"));
        ComplexNumber quotient = calculator.doOperation(a, b);
    }
}
