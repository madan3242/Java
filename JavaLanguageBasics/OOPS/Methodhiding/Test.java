class Parent {
    public static void m1(){
        System.out.println("m1() method parent class");
    }
}

class Child extends Parent{
    public static void m1(){
        // This instance method cannot override the static method from Parent
        System.out.println("m1() method child class");
    }
}

public class Test{
    public static void main(String[] args) {
        // Child c = new Child();
        // c.m1();

        Parent p = new Child();
        p.m1();
    }
}