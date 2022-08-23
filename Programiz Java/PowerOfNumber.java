// Java Program to Calculate the Power of a Number

public class PowerOfNumber {
    public static void main(String[] args){

        // Calculate power of a number using a while loop
        int base = 3, exponent = 3;
        long result = 1;

        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        System.out.println("Answer = "+result);

        // Calculate the power of a number using pow() function

        double result2 = Math.pow(3, 3);
        System.out.println("Answer = "+result2);

    }
}
