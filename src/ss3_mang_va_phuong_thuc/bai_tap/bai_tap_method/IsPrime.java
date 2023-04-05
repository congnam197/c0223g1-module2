package ss3_mang_va_phuong_thuc.bai_tap.bai_tap_method;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số cần kiểm tra: ");
        int number = sc.nextInt();
        System.out.println(checkIsPrime(number));


    }

    public static boolean checkIsPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }
}
