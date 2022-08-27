//Java Program to calculate the power using recursion

public class CalculatePowerRecurssion {
    public static void main(String[] args) {
        int base = 3, poweRaised = 4;
        int result = power(base, poweRaised);

        System.out.println(base+ "^" +poweRaised+ " = "+result);
    }
    static int power(int b, int p){
        if(p != 0){
            return(b * power(b, p-1));
        }
        else{
            return 1;
        }
    }
}
