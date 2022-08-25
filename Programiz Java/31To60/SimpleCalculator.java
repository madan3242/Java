import java.util.Scanner;

//Java Program to Make a Simple Calculator Using switch...case

public class SimpleCalculator {
    int add(int n1, int n2){
        return n1+n2;
    }
    int sub(int n1, int n2){
        return n1-n2;
    }
    int mul(int n1, int n2){
        return n1*n2;
    }
    int div(int n1, int n2){
        return n1/n2;
    }
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);

        System.out.println("Enter num 1");
        int num1 = s.nextInt();
        System.out.println("Enter num 2");
        int num2 = s.nextInt();

        System.out.print("\nAddition: '+' \nSubstraction '-' \nMultiplication '*' \nDivision '/' \nChoose Operator:");
        char operator = s.next().charAt(0);

        SimpleCalculator obj = new SimpleCalculator();
        switch(operator){
            case '+':
                System.out.println(obj.add(num1,num2));
                break;
            case '-':
                System.out.println(obj.sub(num1,num2));
                break;
            case '*':
                System.out.println(obj.mul(num1,num2));
                break;
            case '/':
                System.out.println(obj.div(num1,num2));
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}
