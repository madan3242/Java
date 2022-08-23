//Java Program to Check Armstrong Number

public class ArmstrongNumber {
    public static void main(String[] args){
        // Check Armstrong Number for 3 digit number

        int number = 371, originalNumber, reminder, result = 0;

        originalNumber = number;
        while(originalNumber != 0){
            reminder = originalNumber % 10;
            result += Math.pow(reminder, 3);
            originalNumber /= 10;
        }
        if(result == number){
            System.out.println(number+" is an Armstrong number");
        }
        else{
            System.out.println(number+" is not an Armstrong number");
        }



    }
}
