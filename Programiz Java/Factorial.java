//Java Program to Find Factorial of a Number

import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of "+num+ " = "+fact);
        fact = 1;
        int i = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial of "+num+ " = "+fact);

        BigInteger facto = BigInteger.ONE;
        for (int n = 1; i <= num; i++) {
            facto = facto.multiply(BigInteger.valueOf(n));
        }
        System.out.println("Factorial of "+num+ " = "+fact);
    }
}
