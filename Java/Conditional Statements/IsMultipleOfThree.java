//Program to check given number is multiple of three
import java.util.Scanner;

public class IsMultipleOfThree {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num % 3 == 0){
            System.out.println(num+" is multiple of 3");
        }
        else{
            System.out.println(num+" is multiple of 3");
        }
    }
}
