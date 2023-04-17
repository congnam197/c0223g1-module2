package ss11_java_collection_framework.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu_trong_mot_chuoi;

import java.sql.Array;
import java.util.*;

public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi gì đó :");
        String str = scanner.nextLine();
        String[] array = str.toLowerCase(Locale.ROOT).split(" ");
        Map<String, Integer> mapString = new TreeMap<>();
        for (String word : array) {
            if (mapString.containsKey(word)) {
                mapString.put(word, mapString.get(word) + 1);
            } else {
                mapString.put(word, 1);
            }
        }
        Set<String> stringSet = mapString.keySet();
        for (String s : stringSet) {
            System.out.println("Từ " + "'" + s + "'" + " xuất hiện " + mapString.get(s) + " lần");
        }
    }
}
