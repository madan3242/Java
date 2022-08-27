//Java Program to Find Largest Element of an Array

public class LargestArray {
    public static void main(String[] args) {
        double[] numArray = {34.7, 56.4, 78.56, 84.6, 54.6, 98.7, 34.2};
        double largest = numArray[0];

        for(double num : numArray){
            if(largest < num){
                largest = num;
            }
        }

        System.out.printf("Largest element = %.2f", largest);
    }    
}
