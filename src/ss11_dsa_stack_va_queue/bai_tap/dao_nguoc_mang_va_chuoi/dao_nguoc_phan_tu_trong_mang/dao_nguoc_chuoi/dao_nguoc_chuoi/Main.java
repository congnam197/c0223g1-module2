package ss11_dsa_stack_va_queue.bai_tap.dao_nguoc_mang_va_chuoi.dao_nguoc_phan_tu_trong_mang.dao_nguoc_chuoi.dao_nguoc_chuoi;

public class Main {
    public static void reverse(StringBuffer str) {

        int n = str.length();
        NewStack obj = new NewStack(n);
        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));
        for (i = 0; i < n; i++) {
            char ch = obj.pop();
            str.setCharAt(i, ch);
        }
    }

    public static void main(String args[]) {
        StringBuffer s = new StringBuffer("DaNang");
        reverse(s);
        System.out.println("Reversed string is " + s);
    }
}
