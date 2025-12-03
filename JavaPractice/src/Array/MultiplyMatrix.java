package Array;

public class MultiplyMatrix {
    static void main(String[] args) {

        int[][] matrix01 = {{1,2,3},{4,5,6}};
        int[][] matrix02 = {{7,8},{9,10},{11,12}};

        int rowA = matrix01.length;
        int rowB = matrix01[0].length;


        int colA = matrix02.length;
        int colB = matrix02[0].length;


        int[][] holdMulti = new int[rowA][colB];


        for(int i=0; i<rowA; i++){
            for(int j=0; j<colB; j++){
                int sum = 0;
                for(int k=0; k<colA; k++){
                    sum+= matrix01[i][k]*matrix02[k][j];
                }
                holdMulti[i][j] = sum;
            }

        }

        for(int i=0; i< holdMulti.length; i++){
            for(int j=0; j<holdMulti.length; j++){
                System.out.print(holdMulti[i][j]+" ");
            }
            System.out.println();
        }


    }
}
