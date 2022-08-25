import java.util.Scanner;

//Factorial of a Number Using Recursion

public class FactorialRecurssion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();
        long result;
        result = factorial(num);
        System.out.println(num+ " factorial = "+result);
    }
    static long factorial(int n){
        if(n != 0){
            return n * factorial(n - 1);
        }
        else{
            return 1;
        }
    }
}
