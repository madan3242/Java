import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000, withdraw, deposit;

        while(true){
            System.out.println("------ATM------ \n1.Withdraw\n2.Deposit\n3.Check Balance\n4.Exit\nChoose the operation you want to perfrom:");
            int n = sc.nextInt();

            switch(n){
                case 1: System.out.println("Enter money to be withdrawn");
                withdraw = sc.nextInt();
                if(balance >= withdraw){
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                }
                else{
                    System.out.println("Insufficient Balance");
                }
                break;

                case 2 : System.out.println("Enter money to be deposited");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been succesfully deposited");
                break;

                case 3 : System.out.println("Balance : "+balance);
                break;

                case 4 : System.exit(0);
            }
        }
    }
}
