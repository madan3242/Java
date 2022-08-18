//Program to print 15 to 10 numbers

public class FifteenToTenNumbers {
    public static void main(String[] args) {
        System.out.println("Using for loop");
        for(int i = 15; i >= 10; i--){
            System.out.println(i);
        }

        System.out.println("Using while loop");
        int i = 15;
        while (i >= 10) {
            System.out.println(i);
            i--;
        }

        System.out.println("Using do while loop");
        i = 15;
        do {
            System.out.println(i);
            i--;
        } while (i >= 10);
    }
}
