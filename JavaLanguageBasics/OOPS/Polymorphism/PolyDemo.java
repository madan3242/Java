public class PolyDemo {
    public static void main(String[] args) {
        SavingsAccount a1 = new SavingsAccount();
        a1.setAcc_Id(20550001);
        a1.setAcc_Name("Account 1");
        a1.setAcc_Balance(10000);
        a1.setMin_Bal(500);

        System.out.println("Account Number : "+a1.getAcc_Id() +"\nAccount Name : "+ a1.getAcc_Name()+"\nAccount Balance : "+a1.getAcc_Balance()+"\nMinimum Balance : "+a1.getMin_Bal());

        // a1.cal_Bal();

        AccountServices.ShowDetails(a1);

        CurrentAccount a2 = new CurrentAccount();
        a2.setAcc_Id(20550002);
        a2.setAcc_Name("Account 2");
        a2.setAcc_Balance(25000);
        a2.setMin_Bal(10000);
        System.out.println("---------------------------");
        System.out.println("Account Number : "+a2.getAcc_Id() +"\nAccount Name : "+ a2.getAcc_Name()+"\nAccount Balance : "+a2.getAcc_Balance()+"\nMinimum Balance : "+a2.getMin_Bal());

        // a2.cal_Bal();
        
        AccountServices.ShowDetails(a2);
    }
}