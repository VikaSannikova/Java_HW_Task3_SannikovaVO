package MultiArrays;
import java.util.Random;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());

        //task a
        int[][] matrix = new int[3][3];
        int sum1 = 0, mult1=1, sum2=0, mult2=1;
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++) {
                matrix[i][j]=random.nextInt(99)+1;{
                    if(i==j) {
                        sum1+=matrix[i][j];
                        mult1*=matrix[i][j];
                    }
                    if(i==matrix.length-1-j){
                        sum2+=matrix[i][j];
                        mult2*=matrix[i][j];
                    }

                }
            }
        }
        /*for (int i=0;i<matrix.length;i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }*/
        System.out.println("main sum = "+sum1+" opt multiply = "+ mult1);
        System.out.println("odd sum = "+sum2+" opt multiply = "+mult2);
        System.out.println();

        //task b
        int[][] matrix2=new int[8][5];
        int[] max ={0,0};
        for(int i=0;i<matrix2.length;i++){
            for (int j=0;j<matrix2[i].length;j++) {
                matrix2[i][j]=random.nextInt(199)-99;
                if (matrix2[i][j]>=matrix2[max[0]][max[1]]){
                    max[0]=i;
                    max[1]=j;
                }
                }
                System.out.println(Arrays.toString(matrix2[i]));
            }
        System.out.println("Max element in matrix = "+matrix2[max[0]][max[1]]+" its coord =("+max[0]+", "+max[1]+")");
        System.out.println();

        //task c
        int[][] matrix3=new int[8][5];
        int rowMult =1, maxRowMult=1, pos = 0;
        for(int i=0;i<matrix3.length;i++){
            for (int j=0;j<matrix3[i].length;j++){
                matrix3[i][j]=random.nextInt(21)-10;
                rowMult*=Math.abs(matrix3[i][j]);
            }
            if(maxRowMult<rowMult){
                maxRowMult=rowMult;
                pos =i ;
            }
            rowMult =1;
            System.out.println(Arrays.toString(matrix3[i]));
        }
        System.out.println("Max Mult for row: "+Arrays.toString(matrix3[pos])+" = "+maxRowMult+ " its pos = "+pos);
        System.out.println();

        //task d
        int [][] matrix4 = new int [10][7];
        for(int i=0;i<matrix4.length;i++){
            for (int j=0;j<matrix4[i].length;j++){
                matrix4[i][j]=random.nextInt(101);
            }
            System.out.println(Arrays.toString(matrix4[i]));
        }
        System.out.println();
        for(int i=0;i<matrix4.length;i++){
            Arrays.sort(matrix4[i]);
            System.out.println(Arrays.toString(matrix4[i]));
        }












        }

    }
