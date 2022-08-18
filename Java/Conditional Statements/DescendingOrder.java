//Program to print in ascending order

public class DescendingOrder {
    public static void main(String[] args) {
        int[] arr = {15, 22, 13};
        int temp = 0;
        
        System.out.println("Arry :");

        for(int item : arr){
            System.out.println(item);
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Descending order:");
        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}
