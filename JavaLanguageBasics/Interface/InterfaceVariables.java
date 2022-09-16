interface A{
    int x = 10;
}

public class InterfaceVariables implements A{
    public static void main(String[] args) {
        // x = 100;
        // cannot assign a value to final variable x
        System.out.println(x);
    }
}
