//Java Program to Compute Quotient and Remainder
import java.util.Scanner;

public class ComputeQuotienrReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a dividend");
        int dividend = sc.nextInt();
        System.out.println("Enter a divisor");
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int reminder = dividend % divisor;

        System.out.println("Dividend = "+dividend+"\nDivisor = "+divisor+"\nQuotient = "+quotient+"\nReminder = "+reminder);
    }
}
