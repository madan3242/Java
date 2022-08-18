//Program to print multiplication table of 6 using while loop

public class MultiplicationTableOfSixWhileLoop {
    public static void main(String[] args) {
        int result = 0;

        int i = 1;
        while (i <= 10) {
            result = i * 6;
            System.out.println(6+" * "+i+" = "+result);
            i++;
        }
    }
}
