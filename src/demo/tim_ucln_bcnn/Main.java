package demo.tim_ucln_bcnn;

public class Main {
    public static void main(String[] args) {
        System.out.println("ước chung lớn nhất " + timUCLN(15, 125));
        System.out.println("bội chung nhỏ nhất " + timBCNN(15, 125));
    }

    public static int timUCLN(int a, int b) {
        int ucln = 0;
//        for (int i = 1; i <= a; i++) {
//            if (a % i == 0 && b % i == 0) {
//                ucln = i;
//            }
//        }
        //return ucln;
        if (a == 0 || b == 0) {
            return a + b;
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int timBCNN(int a, int b) {
        int bcnn = 0;
        int max = a * b;
        int step;
        if (a > b) {
            step = a;
        } else step = b;
        for (int i = step; i <= max; i += step) {
            if (i % a == 0 && i % b == 0) {
                bcnn = i;
                break;
            }
        }
        return bcnn;
    }
}
