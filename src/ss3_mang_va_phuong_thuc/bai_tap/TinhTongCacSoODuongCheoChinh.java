package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoODuongCheoChinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, sum = 0;
        System.out.println("Ma trận vuông có dòng và cột bằng nhau!");
        System.out.println("Nhập số dòng và cột của ma trận vuông: ");
        m = n= sc.nextInt();
        int array[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập phần tử [" + i + "]" + "[" + j + "]" + " :");
                array[i][j] = sc.nextInt();
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tổng của đường chéo chính là : "+ sum);

    }

}
