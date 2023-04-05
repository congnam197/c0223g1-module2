package ss3_mang_va_phuong_thuc.bai_tap;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        float max = myNumbers[0][0];
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                if (myNumbers[i][j] > max) {
                    max = myNumbers[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là : " + max);
    }
}
