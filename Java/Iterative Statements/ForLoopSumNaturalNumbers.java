//Program to print sum of first ten natural numbers
public class ForLoopSumNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
