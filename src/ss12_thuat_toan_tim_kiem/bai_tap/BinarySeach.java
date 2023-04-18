package ss12_thuat_toan_tim_kiem.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        System.out.println("Nhập lần lượt các phần tử");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng đã nhập: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
        System.out.println("Nhập phần tử cần tìm: ");
        int value = Integer.parseInt(sc.nextLine());

        int result = binarySearch(arr, 0, n - 1, value);
        if (result == -1) {
            System.out.println(value + " không tìm thấy");
        } else {
            System.out.println(value + " nằm ở vị trí thứ " + result);
        }
    }

    public static int binarySearch(int[] arr, int low, int high, int value) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                return binarySearch(arr, mid + 1, high, value);
            } else {
                return binarySearch(arr, low, mid - 1, value);
            }
        }
        return -1;
    }
}
