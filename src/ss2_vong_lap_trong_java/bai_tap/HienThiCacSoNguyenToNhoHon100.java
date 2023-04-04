package ss2_vong_lap_trong_java.bai_tap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int number = 2;
        while (number < 100) {
            boolean check = true;
            for (int i = 2; i <=Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
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
