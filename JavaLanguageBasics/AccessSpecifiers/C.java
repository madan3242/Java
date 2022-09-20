package pack2;
import pack1.A;
// public class C extends A{
//     public static void main(String[] args) {
//         C obj = new C();
//         // System.out.println(obj.a);
//         System.out.println(obj.b);
//         System.out.println(obj.c);
//         //With help of child class we can access protected 
//         // System.out.println(obj.d);
//     }
// }

public class C{
    public static void main(String[] args) {
        A obj = new A();
        // System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        //With help of child class we can access protected 
        // System.out.println(obj.d);
    }
}
