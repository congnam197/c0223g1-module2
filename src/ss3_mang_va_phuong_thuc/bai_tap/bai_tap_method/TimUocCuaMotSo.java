package ss3_mang_va_phuong_thuc.bai_tap.bai_tap_method;

import java.util.Arrays;
import java.util.Scanner;

public class TimUocCuaMotSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(Arrays.toString(timUoc(number)));

    }

    public static int[] timUoc(int numb) {

        int count = 0;
        int array[] = new int[numb];
        for (int i = 1; i <= numb; i++) {
            if (numb % i == 0) {
                array[count] = i;
                count++;
            }
        }

        int newArray[] = new int[count];
        for (int i = 0; i < count; i++) {
            newArray[i] = array[i];
        }
        return newArray;

    }

}

