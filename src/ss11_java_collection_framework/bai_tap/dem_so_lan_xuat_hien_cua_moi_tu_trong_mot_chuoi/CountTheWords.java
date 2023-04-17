package ss11_java_collection_framework.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu_trong_mot_chuoi;

import java.util.*;

public class CountTheWords {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> mapInteger = new HashMap<>();
        System.out.println("Nhập vào số. Nhập vào số 0 để kết thúc: ");
        while ((number = scanner.nextInt()) != 0) {
            if (!mapInteger.containsKey(number)) {
                mapInteger.put(number, 1);
            } else {
                mapInteger.put(number, mapInteger.get(number) + 1);
            }
        }
        Map<Integer, Integer> highestMapTimes = new HashMap<>();
        mapInteger.forEach((key, value) -> {
            highestMapTimes.put(key, value);
        });
        highestMapTimes.forEach((so, soLan) ->
                System.out.println(so + " xuất hiện " + soLan + " lần"));
    }
}

