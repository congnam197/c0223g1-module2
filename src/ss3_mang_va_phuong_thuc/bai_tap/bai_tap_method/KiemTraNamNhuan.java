package ss3_mang_va_phuong_thuc.bai_tap.bai_tap_method;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra");
        int year = scanner.nextInt();
        System.out.println(isLeap(year));
    }


    public static boolean isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return true;
            }
            return false;

        } else {
            return false;
        }
    }
}
