package ss4_lop_va_doi_tuong.bai_tap.xay_dung_lop_stopwatch;

public class StopWatchManagement {
    public static int[] SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = (int) (Math.random() * 5500);
        }
        long start = System.currentTimeMillis();
        SelectionSort(array);
        long end = System.currentTimeMillis();
        StopWatch stopWatch = new StopWatch(start, end);
        System.out.println("Time: " + stopWatch.getElapsedTime());
        for (int x : array) {
            System.out.println(x);
        }
    }
}

