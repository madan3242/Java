import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int num, firstNum = 0, secondNum = 1;
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter size of fobonacci :");
        num = s.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(firstNum);

            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
