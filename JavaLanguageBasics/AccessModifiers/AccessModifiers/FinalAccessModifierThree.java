class Parent{
    final void display(){

    }
}

class Child extends Parent{
    void display(){

    }
}

public class FinalAccessModifierThree {
    public static void main(String[] args) {
        final int x = 12;
        x = 10;
        System.out.println(x);
    }
}
