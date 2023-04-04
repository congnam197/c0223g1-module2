package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c, i;
        int[] array = {2, 3, 4, 5, 6, 7, 0};
        System.out.println("Nhập phần tử muốn xóa: ");
        int number = sc.nextInt();
        for (c = i = 0; i < array.length; i++) {
            if (array[i] != number) {
                array[c] = array[i];
                c++;
            }
        }
        System.out.println("Mảng sau khi xóa ");
        for (int k : array) {
            System.out.println(k);
        }
    }
}
