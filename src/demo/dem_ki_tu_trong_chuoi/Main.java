package demo.dem_ki_tu_trong_chuoi;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String string = "aaaabbccdfeeee";
        String str = chuoiKhongLap(string);
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)+" so lan xuat hien "+dem(string, str.charAt(i)));
        }
    }

    public static int dem(String str, Character ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static String chuoiKhongLap(String string) {
        Set<Character> set = new HashSet<>();
        String str = "";
        for (int i = 0; i < string.length(); i++) {
            set.add(string.charAt(i));
        }
        for (Character ch : set) {
            str += ch;
        }
        return str;
    }
}
