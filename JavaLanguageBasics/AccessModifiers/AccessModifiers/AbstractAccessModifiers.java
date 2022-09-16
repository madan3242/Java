abstract class Test{
    abstract void display();
    public void hello(){
        System.out.println("Hello");
    }

}
class Display extends Test{
    public void display(){
        System.out.println("HEllo");
    }
}

public class AbstractAccessModifiers {
    public static void main(String[] args) {
        Display d = new Display();
        d.display();
        d.hello();
        // Test t = new Test();
        // t.hello();
    }
}
