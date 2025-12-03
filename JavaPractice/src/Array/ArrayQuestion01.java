package Array;

//anti-diagonal element manipulation

/*
6 2 0
8 0 7
0 6 5
 */

public class ArrayQuestion01 {
    static void main(String[] args) {
        int[][] num = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        idea for solve
//        num[0][2] = 0;
//        num[1][1] = 0;
//        num[2][0] = 0;

        for(int i=0; i<num.length; i++){
            int j = num.length-1-i;
            num[i][j] = 0;

        }
//        System.out.println("The sum is : "+sum);

        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++){
                System.out.print(" "+num[i][j]);
            }
            System.out.println();
        }
    }
}
