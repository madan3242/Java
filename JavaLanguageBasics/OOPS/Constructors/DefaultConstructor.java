class Test{
    Test(){
        this(10);
        System.out.println("Constructor 1");
    }
    Test(int i){
        // super();
        System.out.println("Constructor 2");
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        new Test();
    }
}
