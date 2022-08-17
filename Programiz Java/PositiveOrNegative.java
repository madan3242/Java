// Java Program to Check Whether a Number is Positive or Negative

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = s.nextInt();

        if (num > 0) {
            System.out.println(num+" is positive number");
        } else if(num < 0) {
            System.out.println(num+" is negative number");
        } else{
            System.out.println(num+" is zero");
        }
    }
}
