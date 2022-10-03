@FunctionalInterface
interface TestSum{
    public abstract int sum(int a, int b);
}
public abstract class Test implements TestSum{
    public static void main(String[] args) {

        TestSum t = (a, b) -> a+b;

        System.out.println(t.sum(10, 20));
    }
}