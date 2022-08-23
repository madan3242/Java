import java.util.Scanner;

//Java Program to Display Prime Numbers Between Two Intervals

public class PrimeNumbersInInterval {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter lower limit");
        int low = s.nextInt();
        System.out.println("Enter upper limit");
        int high = s.nextInt();
        
        while(low < high){
            boolean flag = false;

            for(int i = 2; i <= low/2; i++){
                if(low % i == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag && low != 0 && low != 1)
                System.out.println(low);
                
            low++;
        }
    }
    
}