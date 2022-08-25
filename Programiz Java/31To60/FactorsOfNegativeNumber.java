import java.util.Scanner;

//Factors of Negative Number


public class FactorsOfNegativeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a negative number");
        int num = s.nextInt();
        
        System.out.println("Factors of "+num+" are : ");
        for(int i = num; i<= Math.abs(num); i++){
            if(i == 0){
                continue;
            }
            else{
                if(num % i == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
