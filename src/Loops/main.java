package Loops;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner n = new Scanner(System.in);
        int size = n.nextInt();
        //int size = 5;
        System.out.println("The first figure: ");
        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= size; ++col) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("The second figure: ");
        for (int row = 1; row <= size; ++row) {
            for (int col = 0; col <= size - row; ++col) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("The third figure: ");
        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= row; ++col) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("The forth figure: ");
        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col < row; ++col) {
                System.out.print("  ");
            }
            for (int col = row; col <= size; ++col) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("The fifth figure: ");
        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= size - row; ++col) {
                System.out.print("  ");
            }
            for (int col = size - row; col < size; ++col) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("The six figure: ");
        for (int row = 1; row <= size; ++row) {
            if (row == 1 || row == size) {
                for (int col = 1; col <= size; ++col)
                    System.out.print("# ");
            } else {
                for (int col = 1; col <= size; ++col)
                    if (col == 1 || col == size)
                        System.out.print("# ");
                    else
                        System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("The seventh figure: ");
        for (int row = 1; row <= size; ++row) {
            if (row == 1 || row == size) {
                for (int col = 1; col <= size; ++col)
                    System.out.print("# ");
            } else {
                for (int col = 1; col <= row - 1; ++col)
                    System.out.print("  ");
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("The eighth figure: ");
        for (int row = 1; row <= size; ++row) {
            if (row == 1 || row == size) {
                for (int col = 1; col <= size; ++col)
                    System.out.print("# ");
            } else {
                for (int col = 1; col <= size-row; ++col)
                    System.out.print("  ");
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("The ninth figure");
        for (int row = 1; row <= size; ++row) {
            if (row == 1 || row == size) {
                for (int col = 1; col <= size; ++col)
                    System.out.print("# ");
            }
            else {
                for (int col = 1; col <=size; ++col)
                    if(col==row||col==size-row+1){
                        System.out.print("# ");
                    }
                    else{
                        System.out.print("  ");
                    }

               // System.out.print("");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("The tenth figure: ");
        for (int row = 1; row <= size; ++row) {
            if (row == 1 || row == size) {
                for (int col = 1; col <= size; ++col)
                    System.out.print("# ");
            }
            else {
                for (int col = 1; col <=size; ++col)
                    if(col==row||col==size-row+1||col==1||col==size){
                        System.out.print("# ");
                    }
                    else{
                        System.out.print("  ");
                    }

                // System.out.print("");
            }
            System.out.println();
        }
        System.out.println();
   }
}
