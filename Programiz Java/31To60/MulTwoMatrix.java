// Java Program to Multiply Two Matrix Using Multi-dimensional Arrays

public class MulTwoMatrix {
    public static void main(String[] args) {
        int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };

        // Mutliplying Two matrices
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        // Displaying the result
        System.out.println("Multiplication of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}


// import java.util.Scanner;

// public class MulTwoMatrix {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         System.out.println("Enter size of matrix (n x m");
//         int n = s.nextInt();
//         int m = s.nextInt();
//         int[][] arr1 = new int[n][m];
//         int[][] arr2 = new int[n][m];
//         System.out.println("Enter 1st matrix : ");
//         for (int i = 0; i <arr1.length ; i++) {
//             for (int j = 0; j < arr1[i].length; j++) {
//                 arr1[i][j] = s.nextInt();
//             }
//         }
//         System.out.println("Enter 2nd matrix : ");
//         for (int i = 0; i <arr2.length ; i++) {
//             for (int j = 0; j < arr2[i].length; j++) {
//                 arr1[i][j] = s.nextInt();
//             }
//         }

//         int[][] product = new int[n][m];
//         for (int i = 0; i < product.length; i++) {
//             for (int j = 0; j < product[i].length; j++) {
//                 for (int k = 0; k < product.length; k++) {
//                     product[i][j] += arr1[i][k] * arr2[k][j];
//                 }
//             }
//         }

//         System.out.println("Product of 2 matrix :");
//         for(int[] row : product){
//             for(int col : row){
//                 System.out.print(col+" ");
//             }
//             System.out.println();
//         }

        
//     }
// }
