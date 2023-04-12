package ss8_clean_code_va_refactoring.thuc_hanh.doi_ten_bien_va_tach_hang;

public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MUTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MUTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
