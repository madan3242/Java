//Java Program to Calculate Average Using Arrays

public class CalculateAverageUsingArray {
    public static void main(String[] args){
        double[] numArray = {54.8, 68.5, -44.8, 20.56, 89.4};
        double sum = 0.0;

        for(double num : numArray){
            sum += num;
        }

        double average = sum / numArray.length;
        System.out.printf("The average is : %.2f", average);
    }
}
