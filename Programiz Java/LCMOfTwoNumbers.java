import java.util.Scanner;

// Java Program to Find LCM of two Numbers

public class LCMOfTwoNumbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter number 1");
        int num1 = s.nextInt();
        System.out.println("Enter number 2");
        int num2 = s.nextInt();
        int lcm;
        lcm = (num1> num2) ? num1 : num2;
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("LCM of "+num1+" and "+num2+" = "+lcm);
                break;
            }
            ++lcm;
        }

        lcm = 0;
        // Calculate LCM using GCD
        int gcd = 1;
        for(int i = 1; i <= num1 && i <= num2; i++){
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        lcm = (num1 * num2)/ gcd;
        System.out.printf("\n LCM of %d and %d is %d.",num1, num2, lcm);
    }
}
