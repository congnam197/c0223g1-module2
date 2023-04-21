package ss14_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class FindTheLongestConsecutiveString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi nào đó");
        String str = scanner.nextLine();
        System.out.println(str);
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> listMax = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (list.size() > 1 && str.charAt(i) >= list.getLast() && list.contains(str.charAt(i))) {
                list.clear();
            }
            list.add(str.charAt(i));
            if (list.size() > listMax.size()) {
                listMax.clear();
                listMax.addAll(list);
            }
        }
        System.out.print("Chuỗi dài nhất: ");
        for (Character ch : listMax) {
            System.out.print(ch);
        }
    }
}
