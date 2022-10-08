import java.util.function.Supplier;

public class FISupplier {
    public static void main(String[] args) {
        Supplier <Double> getRandomNumber = () -> Math.random();

        System.out.println(getRandomNumber.get());
    }
}
