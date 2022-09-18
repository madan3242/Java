class A{
    int a = 100;
    public void display(){
        System.out.println("Class A display() method");
    }
}
class B extends A{
    int a = super.a;
    public void display(){
        super.display();
        System.out.println("Class B display() method");
    }
}
public class Test{
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        b.display();
    }
}