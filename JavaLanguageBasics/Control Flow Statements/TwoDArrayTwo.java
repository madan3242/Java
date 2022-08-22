import java.util.Scanner;

public class TwoDArrayTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter size of array [n][m]");
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter array elements");
        for(int i = 0; i <arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("Element ["+i+"]["+j+"]");
                arr[i][j] = s.nextInt();
            }
        }
        for(int i = 0; i <arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("["+i+"]["+j+"] : "+arr[i][j]);
            }
        }
    }
}
