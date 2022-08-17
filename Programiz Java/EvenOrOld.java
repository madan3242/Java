import java.util.Scanner;

public class EvenOrOld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();

        if (num % 2 == 0) {
            System.out.println(num+" is even number");
        } else {
            System.out.println(num+" is odd number");
        }

        String result = (num % 2 == 0) ? (num+" is even number") : (num+" is odd number");
        System.out.println(result);
    }
}
