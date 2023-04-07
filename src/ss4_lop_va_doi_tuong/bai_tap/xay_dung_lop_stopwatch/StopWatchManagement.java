package ss4_lop_va_doi_tuong.bai_tap.xay_dung_lop_stopwatch;

import java.util.Arrays;

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
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 5500);
        }
        StopWatch start = new StopWatch();
        start.start();
        SelectionSort(array);
        StopWatch end = new StopWatch();
        end.end();
        StopWatch stopWatch = new StopWatch(start, end);
        System.out.println("Time: " + stopWatch.getElapsedTime());
        System.out.println(Arrays.toString(array));
    }
}

