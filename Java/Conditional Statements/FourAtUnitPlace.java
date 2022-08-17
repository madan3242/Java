//Program to check if a number has four at unit place
import java.util.Scanner;

public class FourAtUnitPlace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int num2 = num % 10;

        if (num2 == 4) {
            System.out.println(num+" has 4 at unit place");
        } else {
            System.out.println(num+" don't have 4 at unit place");
        }
    }
}
