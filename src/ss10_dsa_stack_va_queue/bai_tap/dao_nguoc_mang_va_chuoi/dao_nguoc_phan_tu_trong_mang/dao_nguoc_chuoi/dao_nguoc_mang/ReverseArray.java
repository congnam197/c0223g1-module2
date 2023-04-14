package ss10_dsa_stack_va_queue.bai_tap.dao_nguoc_mang_va_chuoi.dao_nguoc_phan_tu_trong_mang.dao_nguoc_chuoi.dao_nguoc_mang;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;
        int[] newArray = new int[n];
        System.out.println("Mảng trước khi đảo :" + Arrays.toString(array));
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(array[i]);
        }
        for (Integer x : stack) {
            System.out.print(x);
        }
        for (int i = 0; i < n; i++) {
            int e = stack.pop();
            newArray[i] = e;
        }
        System.out.println("mảng sau khi đảo ngược :" + Arrays.toString(newArray));
    }
}
