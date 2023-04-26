package ss13_thuat_toan_sap_xep.thuc_hanh;

import java.util.Arrays;

public class BubbleSort {
    static int[] a = {2, -1, 1, -1, 6, 4, -1, 3, 14, 12};

    public static void main(String[] args) {
        int l=a.length;
        for (int k = 0; k < l; k++) {
            for (int i = k; i < l; i++) {
                if (a[k] > a[i]&& a[k]!=-1&& a[i]!=-1) {
                    int temp = a[i];
                    a[i] = a[k];
                    a[k] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
