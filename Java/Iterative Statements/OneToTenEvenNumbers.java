//Program to print even numbers form 1 to 10
public class OneToTenEvenNumbers {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
                i++;
            }
        }
    }
}
