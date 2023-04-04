package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Nhập phần tử thứ :" + (i + 1) + "của mảng: ");
            numbers[i] = Integer.parseInt(scanner.nextLine());

        }
        System.out.println("Mảng mới tạo " + Arrays.toString(numbers));

        System.out.println("Nhập số để thêm vào mảng :");
        int numb = scanner.nextInt();
        System.out.println("Nhập vị trí cần thêm: ");
        int index = scanner.nextInt();
        if (index <= -1 || index >= numbers.length - 1) {
            System.out.println("Không thêm được vào mảng");
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (index == i) {
                    numbers[numbers.length - 1 - i] = numbers[numbers.length - 2 - i];
                    if (numbers[numbers.length - 2 - i] == index){
                        break;
                    }
                }
                numbers[index]=numb;
            }
        }
        System.out.println("Mảng sau khi thêm " + Arrays.toString(numbers));
    }
}
