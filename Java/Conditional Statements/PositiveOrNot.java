//Program to check given number is positive number

import java.util.Scanner;

public class PositiveOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(num+" is a positive number");
        }
        else if(num == 0){
            System.out.println("Is zero");
        }
        else{
            System.out.println(num+" is a negetive number");
        }
    }
}
