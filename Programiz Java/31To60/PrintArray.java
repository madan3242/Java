import java.util.Arrays;
// Java Program to Print an Array

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for(int element : arr){
            System.out.println(element);
        }

        // Print an Array using standard library Arrays
        System.out.println(Arrays.toString(arr));

        //Print a Multi-dimensional Array

        int[][] array = {{1, 2}, {3, 4, 5}, {6, 7}};
        System.out.println(Arrays.deepToString(array));
    }
}
