import java.util.function.Function;

public class Demo {
    static Function <Integer, Integer> f = (n) -> n * n;

    public static void main(String[] args){
        System.out.println(f.apply(6));
    }
}