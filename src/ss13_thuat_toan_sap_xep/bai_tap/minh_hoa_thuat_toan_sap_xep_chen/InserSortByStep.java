package ss13_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Arrays;
import java.util.Scanner;

public class InserSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng phần tử: ");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ: " + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng mới tạo");
        System.out.println(Arrays.toString(array));
        System.out.println("Bắt đầu quá trình sắp xếp");
        inserSortByStep(array);
        System.out.println("Kết quả " + Arrays.toString(array));
    }

    static void inserSortByStep(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i;
            while (j > 0 && key < arr[j - 1]) {
                if (arr[j - 1] == arr[0]) {
                    System.out.println("Tìm thấy " + key + " < " + arr[0]);
                    System.out.println("chèn " + key + " vào đầu mảng ");
                } else {
                    System.out.println("Tìm thấy " + key + " < " + arr[j - 1]);
                    System.out.println("chèn " + key + " vào giữa vị trí thứ " + (j - 1) + " và " + (j));
                }
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = key;
            System.out.print("Mảng sau khi sắp xếp lần " + i);
            System.out.println(Arrays.toString(arr));
        }
    }
}
