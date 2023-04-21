package ss14_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class FindLongestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi: ");
        String string = scanner.nextLine();
        findString(string);
    }

    public static void findString(String str) {
        LinkedList<Character> listMax = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }
            }
            if (list.size() > listMax.size()) {
                listMax.clear();
                listMax.addAll(list);
            }
            list.clear();
        }
        for (Character ch : listMax) {
            System.out.print(ch);
        }
    }
}
