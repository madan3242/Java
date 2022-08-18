import java.util.Scanner;

//Program to read 5 numbers and display even numbers only
public class ReadAndPrintEven {
    public static void main(String[] args) {
        int size = 5;
        int[] arr = new int[size];

        Scanner s = new Scanner(System.in);

        System.out.println("Enter "+size+" numbers");
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Numbers you have entered are :");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+" ");
        }

        System.out.println("Even numbers are :");
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

    }
}
