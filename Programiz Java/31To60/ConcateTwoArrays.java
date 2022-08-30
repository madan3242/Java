import java.util.Arrays;

//Java Program to Concatenate Two Arrays
import java.util.Arrays;
public class ConcateTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3}, arr2 = {4, 5, 6};
        int aLen = arr1.length;
        int bLen = arr2.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(arr1, 0, result, 0, aLen);
        System.arraycopy(arr2, 0, result, aLen, bLen);

        System.out.println(Arrays.toString(result));
    }
}
