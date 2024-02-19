public interface ComplexNumber {
    double getRealPart();
    double getImaginaryPart();
    ComplexNumber sum(ComplexNumber num);
    ComplexNumber multiply(ComplexNumber num);
    ComplexNumber divide(ComplexNumber num);
}