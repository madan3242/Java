import java.util.Scanner;

//Java Program to Find the Sum of Natural Numbers using Recursion

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = s.nextInt();
        int sum = addNumbers(number);
        System.out.println("Sum = "+sum);
    }

    public static int addNumbers(int num){
        if(num != 0){
            return num + addNumbers(num - 1);
        }
        else{
            return num;
        }
    }
}
