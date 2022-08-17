//Program to check given number is 3 digit
import java.util.Scanner;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num > 99 && num < 1000) {
            System.out.println(num+" is a 3 digit number");
        } else {
            System.out.println(num+" is not a 3 digit number");
        }
    }
}
