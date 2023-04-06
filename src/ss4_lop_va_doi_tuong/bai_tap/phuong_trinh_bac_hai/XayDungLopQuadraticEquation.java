package ss4_lop_va_doi_tuong.bai_tap.phuong_trinh_bac_hai;

import java.util.Scanner;

class XayDungLopQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        double a = input.nextDouble();
        System.out.println("Nhập số b: ");
        double b = input.nextDouble();
        System.out.println("Nhập số c: ");
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Discriminant = " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Nghiệm thứ nhất của phương trình: " + quadraticEquation.getRoot1());
            System.out.println("Nghiệm thứ hai của phương trình: " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có 1 nghiệm duy nhất : " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}

