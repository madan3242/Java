import java.util.Scanner;

// Java Program to Reverse a Number

public class ReverseNumber {
    public static void main(String[] args) {

        int reversed = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();

        System.out.println("Original Number : "+num);
        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number = "+reversed);

        // using for loop 
        num = 2345;
        reversed = 0;

        for(; num != 0; num /= 10){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed number = "+reversed);

    }
}
