import java.util.Scanner;

// Java Program to Find GCD of two Numbers

public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = s.nextInt();
        System.out.println("Enter number 2");
        int num2 = s.nextInt();

        int gcd = 1;

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }

        System.out.println("GCD of "+num1+" and "+num2+" = "+gcd);

        // Find GCD of two numbers using while loop and if else statement
        int n1 = 56, n2 = 48;
        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2;
            }
            else{
                n2 -= n1;
            }
        }
        System.out.println("GCD : "+n1);

        // GCD for both positive and negative numbers
        int a = 56, b = -48;
        a = (a > 0)? a : -a;
        b = (b > 0)? b : -b;

        while (a != b) {
            if (a > b) {
                a -= b;
            }
            else{
                b -= a;
            }
            
        }
        System.out.println("GCD : "+a);
    }
}
