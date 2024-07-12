package complex;

public class Multiply implements ComplexOperation {
    @Override
    public ComplexNumber operate(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new ComplexNumber(real, imaginary);
    }
}
