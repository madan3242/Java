public class DivideByZeroDemo {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(Exception e){
            // System.out.println(e);
            // System.out.println(e.toString());
            // e.printStackTrace();
           
            System.out.println(e.getMessage());
        }
    }
}
