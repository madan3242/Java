package pack1;
import pack1.A;

public class B  extends A{
    public static void main(String[] args) {
        B obj = new B();
        // System.out.println(obj.a);
        // private members we cant access

        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
        obj.m1();
    }
}
