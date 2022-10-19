import java.util.function.Function;

public class FunctionEx {
    static Function<Integer, Integer> f = i -> i*i;
    public static void main(String[] args){
        System.out.println(f.apply(3));
    }
}