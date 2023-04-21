package ss11_dsa_stack_va_queue.bai_tap.kiem_tra_chuoi_palindrome;

import java.util.*;

public class CheckPalindrome {
    public boolean checkString(String str) {
        Queue<String> queue = new ArrayDeque<>();
        Stack<String> stack = new Stack<>();
        String[] array = str.split("");
        boolean flag = true;
        for (String s : array) {
            stack.push(s.toLowerCase(Locale.ROOT));
            queue.add(s.toLowerCase(Locale.ROOT));
        }
        System.out.println(stack);
        System.out.println(queue);
        for (int j = 0; j < stack.size(); j++) {
            if (!stack.pop().equals(queue.poll())) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
