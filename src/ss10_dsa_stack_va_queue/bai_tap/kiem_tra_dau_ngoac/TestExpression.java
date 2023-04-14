package ss10_dsa_stack_va_queue.bai_tap.kiem_tra_dau_ngoac;

import java.util.Scanner;

public class TestExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi kiểm tra:");
        String string = scanner.nextLine();
        CheckExpression checkExpression = new CheckExpression();
        System.out.println(checkExpression.isExpreession(string));
    }
}
