package demo.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int n=0;
        while (fibonaci(n)<100){
            System.out.print(fibonaci(n)+" ");
            n++;
        }
    }
    public static int fibonaci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonaci(n - 1) + fibonaci(n - 2);
    }
}

