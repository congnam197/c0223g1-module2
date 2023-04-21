package ss11_dsa_stack_va_queue.bai_tap.chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class ConvertFromDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số muốn chuyển qua nhị phân:");
        int number = Integer.parseInt(sc.nextLine());
        Stack<Integer> stack = new Stack<>();
        int n = 0;
        int i = 0;
        while (number > 0) {
            i += number % 2 * Math.pow(10, n);
            n++;
            number /= 2;
        }
        stack.push(i);
        System.out.println(stack);
    }
}
