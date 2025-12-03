package Array;

//diagonal element manipulation

/*
0 2 5
8 0 7
4 6 0
 */

public class ArrayQuestion02 {
    static void main(String[] args) {

        int[][] MultiArr = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i<MultiArr.length; i++){
            for(int j=0; j<MultiArr[i].length; j++){
                if(i == j){
                    MultiArr[i][j] = 0;
                }
            }
        }

        for(int i=0; i< MultiArr.length; i++){
            for(int j=0; j<MultiArr[i].length; j++){
                System.out.print(" "+MultiArr[i][j]);
            }
            System.out.println();
        }
    }
}
