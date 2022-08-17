//Program to check given number is divisible by seven
import java.util.Scanner;

public class DivisibleBySeven{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");

        int num = s.nextInt();
        // int num = 10;
        
        if(num % 7 == 0){
            System.out.println(num+" divisible by 7");
        }
        else{
            System.out.println(num+" not divisible by 7");
        }
    }
}