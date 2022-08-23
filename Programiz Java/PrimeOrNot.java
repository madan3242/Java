import java.util.Scanner;

// Java Program to Check Whether a Number is Prime or Not

public class PrimeOrNot {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();
        boolean flag = false;
        // Program to Check Prime Number using a for loop

        for (int i = 2; i <= num / 2; i++) {
            if(num % i == 0){
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.println(num+" is prime number");
        }
        else{
            System.out.println(num+" is not prime number");
        }


        // Program to Check Prime Number using a while loop

        flag = false;
        int i = 2;
        while( i <= num / 2){
            if(num % i == 0){
                flag = true;
                break;
            }
            i++;
        }
        if(!flag){
            System.out.println(num+" is prime number");
        }
        else{
            System.out.println(num+" is not prime number");
        }
    }
}
