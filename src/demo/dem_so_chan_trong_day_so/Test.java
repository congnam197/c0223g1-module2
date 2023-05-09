package demo.dem_so_chan_trong_day_so;

public class Test {
    public static void main(String[] args) {
        int n=1246683;
        System.out.println(count_even_numbers(n));
    }
    public static int count_even_numbers(int n) {
        if (n == 0) return 0;
        if (n % 2 == 0) {
            return count_even_numbers(n / 10) + 1;
        } else {
            return count_even_numbers(n / 10);
        }
    }
}
