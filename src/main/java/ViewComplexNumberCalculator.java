import java.util.Scanner;


public class ViewComplexNumberCalculator {
    CalculatorLogger logable = new CalculatorLogger();
    ComplexNumberCalculator calculator = new ComplexNumberCalculator();
    public void run() {
        while (true) {
            double argOneOne = promptDouble("Введите первое число 1-ой пары: ");
            double argOneTwo = promptDouble("Введите второе число 1-ой пары: ");
            ComplexNumberImpl oneComplexNum = new ComplexNumberImpl(argOneOne, argOneTwo);
            while (true) {
                String cmd = prompt("Введите команду (*, /, +, =) : ");
                if (cmd.equals("*")) {
                    double argTwoOne = promptDouble("Введите первое число 2-ой пары: ");
                    double argTwoWto = promptDouble("Введите второе число 2-ой пары: ");
                    ComplexNumberImpl twoComplexNum = new ComplexNumberImpl(argTwoOne, argTwoWto);
                    oneComplexNum = (ComplexNumberImpl) calculator.multiply(oneComplexNum, twoComplexNum);
                    continue;
                }
                if (cmd.equals("/")) {
                    double argTwoOne = promptDouble("Введите первое число 2-ой пары: ");
                    double argTwoWto = promptDouble("Введите второе число 2-ой пары: ");
                    ComplexNumberImpl twoComplexNum = new ComplexNumberImpl(argTwoOne, argTwoWto);
                    oneComplexNum = (ComplexNumberImpl) calculator.divide(oneComplexNum, twoComplexNum);
                    continue;
                }
                if (cmd.equals("+")) {
                    double argTwoOne = promptDouble("Введите первое число 2-ой пары: ");
                    double argTwoWto = promptDouble("Введите второе число 2-ой пары: ");
                    ComplexNumberImpl twoComplexNum = new ComplexNumberImpl(argTwoOne, argTwoWto);
                    oneComplexNum = (ComplexNumberImpl) calculator.sum(oneComplexNum, twoComplexNum);
                    continue;
                }
                if (cmd.equals("=")) {
                    System.out.println("Результат = " + oneComplexNum);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    private Double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
