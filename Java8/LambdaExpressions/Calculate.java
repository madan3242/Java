import java.util.function.Function;

@FunctionalInterface
interface Multiplication{
    int multiply(int a, int b);
}

@FunctionalInterface
interface Addition{
    int add(int a, int b);
}

public class Calculate {
    
    public static void main(String[] args) {
        Multiplication m1 = (a, b) -> a * b;
        Addition m2 = (a, b) -> a + b;

        

        System.out.println(m1.multiply(6, 7));
        System.out.println(m2.add(10, 20));
    }
}
