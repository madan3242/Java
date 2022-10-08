import java.util.function.Function;

public class Rectangle {
    static Function<Integer, Integer> f = (s) -> s * s;
    public static void main(String[] args) {
        System.out.println(f.apply(5));
    }
}
