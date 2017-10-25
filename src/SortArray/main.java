package SortArray;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

/*        Integer []arr = {2,3,0,9,10,3,6,8,11,2,4,5};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));*/


//test time
//        BUBBLE_SORT       estimatedTime = 1314182
//        SELECTION_SORT    estimatedTime = 882250
//        SORT              estimatedTime = 369493
        int n = 200;
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        System.out.println(Arrays.toString(arr));

        long startTime = System.nanoTime();
        //сменить функцию
        Arrays.sort(arr);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("estimatedTime = " + estimatedTime);

        System.out.println(Arrays.toString(arr));
    }

        public static void bubbleSort ( int[]arr){
            for (int i = arr.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

    public static void selectionSort( int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            //int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_i]) {
                    //min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int temp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = temp;
            }
        }
    }
}


