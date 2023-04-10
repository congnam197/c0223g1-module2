package ss5_accessmodifier_staticmothod_staticproperty.bai_tap.bai_tap_lam_them;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThucPham tp = new ThucPham();
        System.out.println("Nhập mã hàng:");
        tp.setMaHang(sc.nextInt());
        sc.nextLine();
        do {
            System.out.println("nhập tên hàng: ");
            tp.setTenHang(sc.nextLine());
        } while (tp.kiemTraTenHang() == true);
        System.out.println("nhập giá: ");
        tp.setDonGia(sc.nextDouble());
        do {
            System.out.println("nhập năm tháng ngày sản xuất: ");
            tp.setNSX(sc.nextInt(), sc.nextInt(), sc.nextInt());
            System.out.println("nhập năm tháng ngày hết hạn: ");
            tp.setHSD(sc.nextInt(), sc.nextInt(), sc.nextInt());
        } while (tp.kiemTraDieuKien() == true);
        System.out.println(tp);
        tp.kiemtraHSD();


    }
}
