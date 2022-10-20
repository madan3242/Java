
public class DefaultEx implements Connect{
    public static void main(String[] args) {
        DefaultEx de = new DefaultEx();
        de.m1();
        de.m2();
    }

    @Override
    public void m1() {
        System.out.println("m1() method");
    }
}