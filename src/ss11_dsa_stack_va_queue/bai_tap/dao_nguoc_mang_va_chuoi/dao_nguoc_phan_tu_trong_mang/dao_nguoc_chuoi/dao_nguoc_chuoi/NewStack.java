package ss11_dsa_stack_va_queue.bai_tap.dao_nguoc_mang_va_chuoi.dao_nguoc_phan_tu_trong_mang.dao_nguoc_chuoi.dao_nguoc_chuoi;

public class NewStack {
    int size;
    int top;
    char[] array;

    boolean isEmpty() {
        return (top < 0);
    }

    NewStack(int n) {
        top = -1;
        size = n;
        array = new char[size];
    }

    boolean push(char x) {
        if (top >= size) {
            System.out.println("Stack đầy");
            return false;
        } else {
            array[++top] = x;
            return true;
        }
    }

    char pop() {
        if (isEmpty()) {
            System.out.println("Stack trống");
            return 0;
        } else {
            char x = array[top--];
            return x;
        }
    }
}

