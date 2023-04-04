package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKiTuTrongChuoi {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("nhập một chuỗi bất kì :");
        String string = str.nextLine();
        char a = 'a';
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == a) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện kí tự " + a + " trong chuỗi " + string + " là : " + count);
    }
}

