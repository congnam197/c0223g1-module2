package ss3_mang_va_phuong_thuc.bai_tap.bai_tap_method;

class InDayFibonacci {
    public static void main(String[] args) {
        dayFibonacci();
    }

    public static void dayFibonacci() {
        int numb1 = 0;
        int numb2 = 1;
        int numb3 = 0;
        while (numb3 < 100) {
            System.out.println(numb3);
            numb1 = numb2;
            numb2 = numb3;
            numb3 = numb1 + numb2;
        }
    }
}
