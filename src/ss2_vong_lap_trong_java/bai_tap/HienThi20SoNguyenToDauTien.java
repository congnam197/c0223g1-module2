package ss2_vong_lap_trong_java.bai_tap;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int count = 0;
        int number=2;
        while (count <= 20) {
            boolean check = true;
            for (int i = 2; i <=Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    count++;
                    break;
                }
            }
            if (check){
                System.out.println(number);
            }
            number++;
        }
    }
}
