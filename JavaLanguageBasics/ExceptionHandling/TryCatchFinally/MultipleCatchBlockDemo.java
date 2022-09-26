class Test{
    int num;

}
public class MultipleCatchBlockDemo {
    public static void main(String[] args) {
        int[] size = {34, 54, 23, 12};
        try{
            Test t = null; 
            t.num = 10; //null pointer exception
            System.out.println(t.num);
            System.out.println(100/0); //Arithmetic exception
            System.out.println(size[10]);// ArrayOutOfBoundException
        }
        catch(NullPointerException ne){
            System.out.println(ne);
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
