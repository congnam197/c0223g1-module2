package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TongCacSoOMotCot {
    public static void main(String[] args) {
        int m, n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng của ma trận :");
        m = sc.nextInt();
        System.out.println("Nhập số cột của ma trận");
        n = sc.nextInt();
        int array[][] = new int[m][n];
        System.out.println("Nhập phần tử cho ma trận ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập phần tử [" + i + "]" + "[" + j + "]" + " :");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Nhập cột muốn tính tổng");
        int index = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (index == j) {
                    sum +=array[i][index];
                }
            }

        }
        System.out.println("Tổng của cột thứ "+index+" :"+sum);
    }
}
