package ss13_thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int pos = i - 1;
            int key = arr[i];
            while (pos >= 0 && key < arr[pos]) {
                arr[pos + 1] = arr[pos];
                pos--;
            }
            arr[pos + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arrayNumbers = {1, 9, 5, 81, 32, 14, 7, 44, 23, 95, 16, 34};
        insertionSort(arrayNumbers);
        System.out.println(Arrays.toString(arrayNumbers));
    }
}

