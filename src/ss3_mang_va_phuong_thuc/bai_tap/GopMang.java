package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài mảng thứ nhất:");
        int size1 = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " :");
            arr1[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Nhập chiều dài mảng thứ hai:");
        int size2 = Integer.parseInt(sc.nextLine());
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " :");
            arr2[i] = Integer.parseInt(sc.nextLine());
        }
        int size3 = size1 + size2;
        System.out.println("Mảng 1 : "+Arrays.toString(arr1));
        System.out.println("Mảng 2 : "+Arrays.toString(arr2));
        int[] arr3 = new int[size3];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + (arr2.length-1)] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));

    }
}
