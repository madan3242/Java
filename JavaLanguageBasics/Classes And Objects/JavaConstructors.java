public class JavaConstructors {

    private int num1, num2;
    public JavaConstructors(int a, int b){
        num1 = a;
        num2 = b;
        System.out.println(num1+"\t"+num2);
    }
    
    public void display(){
        System.out.println(num1+"\t"+num2);
    }
    public static void main(String[] args) {
        JavaConstructors jc = new JavaConstructors(5, 4);

        jc.display();
    }
}
