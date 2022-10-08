import java.util.function.Predicate;

public class FIPredicate {
    public static void main(String[] args) {
        Predicate <String> checkLength = str -> str.length() < 5;
        System.out.println(checkLength.test("Hello there"));
    }
}