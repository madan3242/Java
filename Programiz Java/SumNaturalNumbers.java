import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of numbers");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("The sum of "+num+" natural numbers = "+sum);
        sum = 0;
        //Sum of Natural Numbers using while loop
        int i = 1;
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println("The sum of "+num+" natural numbers = "+sum);
    }
}
