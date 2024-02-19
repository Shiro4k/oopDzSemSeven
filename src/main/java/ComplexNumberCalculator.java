public class ComplexNumberCalculator{
    CalculatorLogger logger = new CalculatorLogger();
    public ComplexNumber sum(ComplexNumber num1, ComplexNumber num2) {
        logger.log("Вызволся метод сложения с пораметрами: " + num1 + ' ' + num2);
        return num1.sum(num2);
    }

    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        logger.log("Вызволся метод умножения с пораметрами: " + num1 + ' ' + num2);
        return num1.multiply(num2);
    }

    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        logger.log("Вызволся метод деление с пораметрами: " + num1 + ' ' + num2);
        return num1.divide(num2);
    }
}