package demo.mangChu;

import java.util.*;

public class Main {
    //Viết hàm so sánh 2 danh sách liên kết đơn gồm các chuỗi, đầu ra là 1 danh sách liên kết đơn chứa kết quả so sánh.
    // Nếu 2 phần tử cùng giá trị, cùng vị trí thì trả về “Yes”, ngược lại trả về “No”.
    // Ví dụ: LinkedList 1: [“Java”, “PHP”, “Python”, “Ruby”] LinkedList 2: [“Java”, “JavaScript”, “Python”]
    // => LinkedList 3: [“Yes”, “No”, “Yes”, “No”]
    public static void main(String[] args) {
//        List<String> list1 = new LinkedList<>();
//        list1.add("Java");
//        list1.add("PHP");
//        list1.add("Python");
//        list1.add("Ruby");
//        List<String> list2 = new LinkedList<>();
//        list2.add("Java");
//        list2.add("JavaScrip");
//        list2.add("Python");
//        List<String> list3 = doiTen(list1, list2);
//            System.out.print(list3);
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(100, "A");
        map.put(103, "eeeee");
        map.put(104, "B");
        map.put(106, "C");
        System.out.println(get_one_greater_key_entry(map,100));
    }

    public static List<String> doiTen(List<String> list1, List<String> list2) {
        List<String> list = new LinkedList<>();
        for (String e : list1) {
            list.add(list2.contains(e) ? "Yes" : "No");
        }
        return list;
    }
    public static String get_one_greater_key_entry(TreeMap<Integer, String> treeMap, int key) {
        String input = treeMap.higherEntry(key).toString();
        System.out.println(input);

        int equalPosition = input.indexOf("=");
        System.out.println("equal   "+equalPosition);

        String result = input.substring(equalPosition + 1);

        if (result.equals("null")) {

            return "No";

        } else

            return result;
    }

}
