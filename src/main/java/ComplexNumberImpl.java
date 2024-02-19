public class ComplexNumberImpl implements ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumberImpl(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public double getRealPart() {
        return realPart;
    }

    @Override
    public String toString() {
        return "{ "+ realPart + " | " + imaginaryPart + " }";
    }

    @Override
    public double getImaginaryPart() {
        return imaginaryPart;
    }
    @Override
    public ComplexNumber sum(ComplexNumber num) {
        return new ComplexNumberImpl(this.realPart + num.getRealPart(),
                this.imaginaryPart + num.getImaginaryPart());
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num) {
        double newRealPart = this.realPart * num.getRealPart();
        double newImaginaryPart = this.imaginaryPart * num.getImaginaryPart();
        return new ComplexNumberImpl(newRealPart, newImaginaryPart);
    }

    @Override
    public ComplexNumber divide(ComplexNumber num) {
        double newRealPart = this.realPart / num.getRealPart();
        double newImaginaryPart = this.imaginaryPart / num.getImaginaryPart();
        return new ComplexNumberImpl(newRealPart, newImaginaryPart);
    }
}