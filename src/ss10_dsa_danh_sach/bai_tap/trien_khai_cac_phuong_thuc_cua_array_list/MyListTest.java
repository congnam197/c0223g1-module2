package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList(6);
        myList.add("Student1");
        myList.add("Student2");
        myList.add("Student3");
        myList.add("Student4");
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3));
        System.out.println("Phần tử bị xóa đi " +myList.get(2));
        myList.remove(2);
        System.out.println("Mảng sau khi xóa");
        System.out.println(myList);
    }
}
