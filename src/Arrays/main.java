package Arrays;

import java.util.Arrays;

import static java.lang.Math.random;

public class main {
    public static void main(String[] args) {
    //task a
        int[]arr = new int[50];
        for(int i=0;i<=49;i++){
            arr[i]=i*2+1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("[");
        for(int i=49;i>=0;i--){
            System.out.print(arr[i]+", ");
        }
        System.out.print("]");
        System.out.println();
    //task b
        int[] arr2 = new int[20];
        int evenCount=0;
        for(int i=0;i<arr2.length;i++){
            arr2[i] = (int)(Math.random()*11);
            if (arr2[i]%2==0) evenCount++;
        }
        System.out.println("arr2: "+Arrays.toString(arr2));
        System.out.println("Amount of evev numbers = "+evenCount
                +"; Amount of odd numbers = " + (arr2.length-evenCount) );
        System.out.println();
    //task c
        int[] arr3 = new int[10];
        for(int i=0;i<arr3.length;i++){
            arr3[i] = (int)(Math.random()*101);
        }
        System.out.println("arr3: "+Arrays.toString(arr3));
        for(int i=1;i<arr3.length;i+=2){
            arr3[i]=0;
        }
        System.out.println("modified arr3: "+Arrays.toString(arr3));
        System.out.println();

    //task d
        int[] arr4 = new int[15];
        for(int i=0;i<arr4.length;i++){
            arr4[i] = (int)(Math.random()*101-50);
        }
        System.out.println("arr4: "+Arrays.toString(arr4));

        int minIndex =0, maxIndex =0 ;
        for(int i=0; i< arr4.length;i++){
            if(arr4[i]<=arr4[minIndex]) minIndex=i;
            if(arr4[i]>=arr4[maxIndex]) maxIndex=i;
        }
        System.out.println("min = "+arr4[minIndex]+" minIndex = "+minIndex);
        System.out.println("max = "+arr4[maxIndex]+" maxIndex = "+maxIndex);
    }
}
