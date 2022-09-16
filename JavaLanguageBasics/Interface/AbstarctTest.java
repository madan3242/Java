interface TestInterface{
    void m1();
    void m2();
}
abstract class Test implements TestInterface{
    public void m1(){
        System.out.println("Hello");
    }
}
public class AbstarctTest extends Test{
    public void m2(){
        System.out.println("Hello  from m2()");
    }
    public static void main(String[] args) {
        TestInterface t = new AbstarctTest();
        t.m1();
        t.m2();
    }
}