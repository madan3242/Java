class A{
    A(){
        System.out.println("Parent class Constructor");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("Child class Constructor");
    }
}

public class TestSuperConst {
    public static void main(String[] args) {
        B b = new B();
    }
}
