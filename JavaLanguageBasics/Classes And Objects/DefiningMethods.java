public class DefiningMethods {

    public double calculateAnswer(double wingSpan, int numberOfEngines, double length, double grossTime){
        //Do the calculation
        return 0;
    }

    public int sumOfTwoNumbers(int num1, int num2){
        return num1+num2;
    }

    public void addTwoNumbers(int num1, int num2){
        System.out.println(num1+num2);
    }

    public void addNumbers(int num1, int num2){
        System.out.println(num1+num2);
    }

    public void addNumbers(int num1, float num2){
        System.out.println(num1+num2);
    }
    public void addNumbers(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }
    // public void addNumbers(int num1, float num2){
    //     System.out.println(num1+num2);
    // }

    public static void main(String[] args) {
        DefiningMethods dm1 = new DefiningMethods();

        dm1.addTwoNumbers(4, 3);

        DefiningMethods dm2 = new DefiningMethods();

        dm2.addNumbers(3, 4.5f);

        

        int notNum = dm1.sumOfTwoNumbers(9, 4);
        System.out.println(notNum);

        
    }
}
