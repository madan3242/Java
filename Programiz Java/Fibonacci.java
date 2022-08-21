
public class Fibonacci {
    public static void main(String[] args){
        int num = 10, firstNum = 0, secondNum = 1;
        System.out.println("The Fibonacci series till "+num+" is :");
        for (int i = 0; i < num; i++) {
            System.out.println(firstNum+" ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
