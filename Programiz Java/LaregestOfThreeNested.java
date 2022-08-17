// Java Program to Find the Largest Among Three Numbers using nested if
import java.util.Scanner;
public class LaregestOfThreeNested {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number 1");
        int num1 = s.nextInt();
        System.out.println("Enter number 2");
        int num2 = s.nextInt();
        System.out.println("Enter number 3");
        int num3 = s.nextInt();

        if(num1 > num2){
            if (num1 > num3) {
                System.out.println(num1 + " is greater number");
            } else {
                System.out.println(num3 + " is greater number");
            }
        }
        else{
            if (num2 > num3) {
                System.out.println(num2 + " is greater number");   
            }
            else{
                System.out.println(num3 + " is greater number");
            }
        }
    }
}
