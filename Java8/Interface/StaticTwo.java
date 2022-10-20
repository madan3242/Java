interface InterfaceOne{
    public static void m1(){
        System.out.println("m1() method");
    }
}

public class StaticTwo {
    public static void main(String[] args) {
        InterfaceOne.m1();
    }
}
