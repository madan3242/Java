@FunctionalInterface
interface TestSum{
    public abstract int sum(int a, int b);
}
public class Test{
    public static void main(String[] args) {

        TestSum t = (a, b) -> a+b;

        System.out.println(t.sum(10, 20));
    }
}