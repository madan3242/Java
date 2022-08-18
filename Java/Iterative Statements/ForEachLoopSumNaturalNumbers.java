//Program to print sum of first ten natural numbers for each loop
public class ForEachLoopSumNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : arr) {
            System.out.println(i);
        }
        for(int item : arr){
            sum +=item;
        }
        System.out.println(sum);
    }
}
