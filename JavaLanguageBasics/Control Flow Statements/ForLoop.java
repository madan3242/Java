public class ForLoop {
    public static void main(String[] args){
        // for (initialization; termination; increment) {
        //     statement(s)
        // }
        for(int i = 1; i <= 10; i++){
            System.out.println("i = "+i);
        }

        // infinite loop
        // for ( ; ; ) {

        //     // your code goes here
        //     System.out.println("Hello");
        // }

        //Enhanced for loop
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for(int item : numbers){
            System.out.println("item = "+item);
        }

    }
}
