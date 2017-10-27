package Enums;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

import static Enums.newEnum.*;
enum newEnum{
    Denis, Evgeny, Semen, Anya, Zhenya, Katya, Vika, Dima, Roma, Gleb, Boris, Alice, Oleg, NETCRACKER, MneLenPridumivatChtoto, Error
}

public class main {
    public static void main(String[] args) {
        System.out.print("Input your member of enum: ");
        Scanner n = new Scanner(System.in);
        //String nn = n.nextLine();

        newEnum test;
        try {
            test = newEnum.valueOf(n.nextLine());
        }
        catch(IllegalArgumentException e){
            test = Error;
        }
        long startTime = System.nanoTime();
        if(test == Denis) System.out.println("Denis is here.");
        else if(test == Evgeny) System.out.println("Evgeny is here");
        else if(test == Semen) System.out.println("Semen is here.");
        else if(test == Anya) System.out.println("Anya is here.");
        else if(test == Zhenya) System.out.println("Zhenya is here.");
        else if(test == Katya) System.out.println("Katya is here.");
        else if(test == Vika) System.out.println("Vika is here.");
        else if(test == Dima) System.out.println("Dima is here.");
        else if(test == Roma) System.out.println("Roma is here.");
        else if(test == Gleb) System.out.println("Gleb is here");
        else if(test == Boris) System.out.println("Boris is here.");
        else if(test == Alice) System.out.println("Alice is here.");
        else if(test == Oleg) System.out.println("Oleg is here");
        else if(test == NETCRACKER) System.out.println("NETCRACKER is here");
        else if(test == MneLenPridumivatChtoto) System.out.println("MneLenPridumivatChtoto is here.");
        else System.out.println("It's not enum member");
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("estimatedTime (if - else) = " + estimatedTime + "\n");


        startTime = System.nanoTime();
        switch(test) {
            case Denis:
                System.out.println("Denis is here.");
                break;
            case Evgeny:
                System.out.println("Evgeny is here.");
                break;
            case  Semen:
                System.out.println("Semen is here.");
                break;
            case Anya:
                System.out.println("Anya is here.");
                break;
            case Zhenya:
                System.out.println("Zhenya is here.");
                break;
            case Katya:
                System.out.println("Katya is here.");
                break;
            case Vika:
                System.out.println("Vika is here.");
                break;
            case Dima:
                System.out.println("Dima is here.");
                break;
            case Roma:
                System.out.println("Roma is here.");
                break;
            case Gleb:
                System.out.println("Gleb is here.");
                break;
            case Boris:
                System.out.println("Boris is here.");
                break;
            case Alice:
                System.out.println("Alice is here.");
                break;
            case Oleg:
                System.out.println("Oleg is here.");
                break;
            case NETCRACKER:
                System.out.println(" NETCRACKER is here.");
                break;
            case MneLenPridumivatChtoto:
                System.out.println("MneLenPridumivatChtoto is here.");
                break;
            default:
                System.out.println("it's not enum member");
                break;
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("estimatedTime (switch - case) = " + estimatedTime);
        System.out.println();

        //part 2
        Random random = new Random(System.currentTimeMillis());
        int[] arr = new int[50];
        int[] count = new int[11];
        int[] count2 = new int[11];
        for(int i=0;i<arr.length;i++) {
            arr[i] = random.nextInt(11);
        }
        System.out.println(Arrays.toString(arr));
        startTime = System.nanoTime();
        for(int i=0;i<arr.length;i++) {

            switch (arr[i]) {
                case 0:
                    count[arr[i]]++;
                    break;
                case 1:
                    count[arr[i]]++;
                    break;
                case 2:
                    count[arr[i]]++;
                    break;
                case 3:
                    count[arr[i]]++;
                    break;
                case 4:
                    count[arr[i]]++;
                    break;
                case 5:
                    count[arr[i]]++;
                    break;
                case 6:
                    count[arr[i]]++;
                    break;
                case 7:
                    count[arr[i]]++;
                    break;
                case 8:
                    count[arr[i]]++;
                    break;
                case 9:
                    count[arr[i]]++;
                    break;
                case 10:
                    count[arr[i]]++;
                    break;
                default:
                    System.out.println("hmmm..it's strange");
                    break;
            }
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("estimatedTime (switch - case) = " + estimatedTime);

        startTime = System.nanoTime();
        for (int i =0;i<arr.length;i++){
            if (arr[i] == 0) count2[arr[i]]++;
            else if (arr[i] == 1) count2[arr[i]]++;
            else if (arr[i] == 2) count2[arr[i]]++;
            else if (arr[i] == 3) count2[arr[i]]++;
            else if (arr[i] == 4) count2[arr[i]]++;
            else if (arr[i] == 5) count2[arr[i]]++;
            else if (arr[i] == 6) count2[arr[i]]++;
            else if (arr[i] == 7) count2[arr[i]]++;
            else if (arr[i] == 8) count2[arr[i]]++;
            else if (arr[i] == 9) count2[arr[i]]++;
            else if (arr[i] == 10) count2[arr[i]]++;
            else System.out.println("hmmm..it's strange");
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("estimatedTime (if - else) = " + estimatedTime);
        System.out.println();

        for (int i =0; i<=10;i++){
            System.out.println("Element = " +i+ " its count = "+count[i]+" in switch-case branch; " + count2[i]+ " in if-else branch");
        }

    }
}
