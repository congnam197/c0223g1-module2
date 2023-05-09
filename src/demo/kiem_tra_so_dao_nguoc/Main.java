package demo.kiem_tra_so_dao_nguoc;

public class Main {
    public static void main(String[] args) {
        int num = 1234321;
        int n = 1234;
        System.out.println(kiemTra(num));
        System.out.println(daoNguocSo(n));
    }

    public static boolean kiemTra(int number) {
        boolean flag = true;
        int r;
        int sum = 0;
        for (int i = 0; i < number; i++) {
            r = number % 10;
            sum = sum * 10 + r;
            number /= 10;
            if (sum == number) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public static int daoNguocSo(int n) {
        int daoNguoc = 0;
        int soDu = 0;
        while (n > 0) {
            soDu = n % 10;
            daoNguoc = daoNguoc * 10 + soDu;
            n = n / 10;
        }
        return daoNguoc;
    }
}
