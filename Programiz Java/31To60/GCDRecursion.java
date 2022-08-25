//Java Program to Find G.C.D Using Recursion

public class GCDRecursion {
    public static void main(String[] args) {
        int n1 = 36, n2 = 60;
        int hcf = hcf(n1, n2);

        System.out.println("G.C.D of "+n1+" and "+n2+" is "+hcf);
    }
    static int hcf(int n1, int n2){
        if(n2 != 0){
            return hcf(n2, n1 % n2);
        }
        else{
            return n1;
        }
    }
}
