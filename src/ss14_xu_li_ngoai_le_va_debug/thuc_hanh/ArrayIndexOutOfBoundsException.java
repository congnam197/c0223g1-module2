package ss14_xu_li_ngoai_le_va_debug.thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public Integer[] creatRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử có trong mảng");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException arrExemple = new ArrayIndexOutOfBoundsException();
        Integer[] arr = arrExemple.creatRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Nhập 1 chỉ số bất kì");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử ở chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
