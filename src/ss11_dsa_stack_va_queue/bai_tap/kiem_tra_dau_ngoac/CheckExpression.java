package ss11_dsa_stack_va_queue.bai_tap.kiem_tra_dau_ngoac;

import java.util.Stack;

public class CheckExpression {
    boolean isExpreession(String str) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        boolean flag = true;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ')' && stack1.isEmpty()) {
                flag = false;
            } else if (str.charAt(i) == '(') {
                stack1.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                stack2.push(str.charAt(i));
            }
            if (stack1.size() < stack2.size()) {
                flag = false;
                break;
            }
            if ((flag) && stack1.size() == stack2.size()) {
                flag = true;
            }
        }
        return flag;
    }
}
