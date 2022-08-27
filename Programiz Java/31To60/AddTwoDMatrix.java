//Java Program to Add Two Matrix Using Multi-dimensional Arrays

public class AddTwoDMatrix {
    public static void main(String[] args) {
        int rows = 2, colums = 3;
        int[][] first = {{1, 8, 6}, {7, 5, 6}};
        int[][] second = {{5, 4, 12}, {8, 43, 11}};

        int[][] sum = new int[rows][colums];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < colums; j++){
                sum[i][j] = first[i][j] + second[i][j];
            }
        }

        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum){
            for(int column : row){
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }    
}
