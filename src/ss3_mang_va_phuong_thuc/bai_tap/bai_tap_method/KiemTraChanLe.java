package ss3_mang_va_phuong_thuc.bai_tap.bai_tap_method;

import java.util.Scanner;

public class KiemTraChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên cần kiểm tra");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(isOdd(number));
    }

    public static Boolean isOdd(int num) {
        if (num % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}

