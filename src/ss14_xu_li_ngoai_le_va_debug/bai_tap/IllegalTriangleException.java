package ss14_xu_li_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhập 3 cạnh tam giác: ");
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Nhập cạnh a: ");
                a = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh b: ");
                b = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cạnh c: ");
                c = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Không phải số !Mời nhập lại");
                continue;
            }
            try {
                checkTriangleEdge(a, b, c);
            } catch (TriangleEdgeException e) {
                System.out.println(e.getMessage());
                System.out.println("Mời nhập lại");
                continue;
            }
            flag = false;
        }
        System.out.println("Okee! ");
    }

    public static boolean checkTriangleEdge(int a, int b, int c) throws TriangleEdgeException {
        if (a < 0 || b < 0 || c < 0) {
            throw new TriangleEdgeException("Cạnh phải lớn hơn 0");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleEdgeException("Không thỏa mãn  là 3 cạnh của một tam giác");
        } else {
            System.out.println("Đây là 3 cạnh của tam giác");
            return true;
        }
    }
}
