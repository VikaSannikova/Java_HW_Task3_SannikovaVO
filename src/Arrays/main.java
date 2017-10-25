package Arrays;

import java.util.Arrays;

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
    }
}
