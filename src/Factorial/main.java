package Factorial;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner n = new Scanner(System.in);
        int nn = n.nextInt();
        long startTime = System.nanoTime();
        System.out.println(factorial(nn));
        long estimatedTime = System.nanoTime() - startTime;

        System.out.println("estimatedTime factorial = " + estimatedTime);
        System.out.println();
        startTime = System.nanoTime();
        System.out.println(factorialR(nn));
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("estimatedTime factorialR = " + estimatedTime);
    }


    public static long factorialR(int n){
        if(n < 0) return -1;
        if(n == 0 || n == 1) return 1;
        return factorialR(n-1) * n;
    }

    public static long factorial(int n){
        if (n<0) return -1;
        if(n==0||n==1) return 1;
        long result = 1;
        for(int i=2;i<=n;i++){
            result*=i;
        }
        return result;
    }
}
