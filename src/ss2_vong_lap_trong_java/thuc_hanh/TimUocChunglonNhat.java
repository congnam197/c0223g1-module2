package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimUocChunglonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập số b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("không có ước chung");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Ước số chung lớn nhất của 2 số là : "+a );


    }
}
