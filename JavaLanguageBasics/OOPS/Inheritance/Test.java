class Parent{
    public void m1(){
        System.out.println("Parent Class : m1() method");
    }
}

class Child extends Parent{
    public void m2(){
        System.out.println("Child Class : m2() method");
    }
}

public class Test{
    public static void main(String[] args){
        // Parent p = new Parent();
        // p.m1();
        // p.m2();

        Child c = new Child();
        c.m1();
        c.m2();

        // Parent p1 = new Child();
        // p1.m1();
        // p1.m2();

        // Child c1 = new Parent();
        // c1.m1();
        // c1.m2();
    }
}