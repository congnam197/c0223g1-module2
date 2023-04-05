package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tiGia = 23000;
        System.out.println("Nhập số tiền đô la: ");
        double doLa = scanner.nextDouble();
        double vnd;
        vnd = doLa * tiGia;
        System.out.print("Số tiền việt là : " + vnd + "đồng");

    }
}