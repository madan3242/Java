//Java Program to Swap Two Numbers
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter a number 2");
        int num2 = sc.nextInt();

        System.out.println("Before swap: \n Number 1 = "+num1+"\n Number 2 = "+num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap: \n Number 1 = "+num1+"\n Number 2 = "+num2);

        //Swap two numbers without using temporary variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swap: \n Number 1 = "+num1+"\n Number 2 = "+num2);

    }
}
