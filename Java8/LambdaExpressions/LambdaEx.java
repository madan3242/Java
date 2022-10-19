@FunctionalInterface
interface Test2{
    int sum(int a, int b);
}

public class LambdaEx{
    public static void add(Test2 t2){
        t2.sum(3, 3);
    }
    public static void main(String[] args) {
        // Test2 t1 = (a , b) -> { return a * b; };

        // System.out.println(t1.sum(4, 5));

        add((a, b) -> System.out.println(a + b));

    }
}