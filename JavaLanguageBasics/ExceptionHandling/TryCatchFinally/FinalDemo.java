public class FinalDemo {
    public static void main(String[] args) {
        try{
            System.out.println(100/0); //Arithmetic exception
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Northing");
        }
    }
}