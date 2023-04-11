package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class DoiSoThanhChu {

    static String motChuSo(int x) {
        switch (x) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
        return "";
    }

    static String soDonVi(int x) {
        switch (x) {
            case 0:
                return "";
            case 1:
                return "-one";
            case 2:
                return "-two";
            case 3:
                return "-three";
            case 4:
                return "-four";
            case 5:
                return "-five";
            case 6:
                return "-six";
            case 7:
                return "-seven";
            case 8:
                return "-eight";
            case 9:
                return "-nine";
        }
        return "";
    }

    static String muoiDenMuoiChin(int x) {
        switch (x) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
        }
        return "";
    }

    static String haiChuSo(int x) {
        int hangchuc = (int) x / 10, hangdonvi = x % 10;
        switch (hangchuc) {
            case 2:
                return "twenty" + soDonVi(hangdonvi);
            case 3:
                return "thirty" + soDonVi(hangdonvi);
            case 4:
                return "fourty" + soDonVi(hangdonvi);
            case 5:
                return "fifty" + soDonVi(hangdonvi);
            case 6:
                return "sixty" + soDonVi(hangdonvi);
            case 7:
                return "seventy" + soDonVi(hangdonvi);
            case 8:
                return "eighty" + soDonVi(hangdonvi);
            case 9:
                return "ninety" + soDonVi(hangdonvi);
        }
        return "";
    }

    static String baChuSo(int x) {
        int hangtram = (int) x / 100, phansau = x % 100;
        return motChuSo(hangtram) + " hundred " + haiChuSo(phansau);
    }

    public static void main(String[] args) {
        int x;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if (x < 10) System.out.println(motChuSo(x));
        else if (x < 20) System.out.println(muoiDenMuoiChin(x));
        else if (x < 100) System.out.println(haiChuSo(x));
        else System.out.println(baChuSo(x));
    }
}