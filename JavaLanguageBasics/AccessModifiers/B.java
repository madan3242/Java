package pack2;
import pack1.A;

public class B {
    public static void main(String[] args) {
        A a = new A();
        a.m1(); //Public
        // a.m2(); default
        // a.m3(); private
        // a.m4(); protected

    }
}
