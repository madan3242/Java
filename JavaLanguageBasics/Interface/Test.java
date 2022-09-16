interface TestInterface{
    void m1();
    void m2();
}

public class Test implements TestInterface{
    public void m1(){
        System.out.println("m1() method");
    }
    public void m2(){
        System.out.println("m2() method");
    }
    public static void main(String[] args) {
        TestInterface t = new Test();
        t.m1();
    }
}