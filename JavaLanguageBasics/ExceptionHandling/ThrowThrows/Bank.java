class InsufficantFunds extends Exception{
    public String toString(){
        return "InsufficiantFunfs! Please deposit money";
    }
}
public class Bank {
    double balance = 50000;
    public void withDraw(double amount) throws InsufficantFunds{
        if(balance  > amount){
            System.out.println("Withdraw money");
        }
        else{
            throw new InsufficantFunds();
        }
    }
    public static void main(String[] args) throws InsufficantFunds {
        // Bank c1 = new Bank();
        // c1.withDraw(50000);

        try{
            Bank c2 = new Bank();
            c2.withDraw(50000);
        }
        catch(InsufficantFunds e){
            // System.out.println(e);
            // e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}