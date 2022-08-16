public class WhileAndDoWhile {
    public static void main(String[] args) {

    //While Loop
    //     while (expression) {
    //         statement(s)
    //    }
       int count = 1;
       while(count <= 10){
        System.out.println(count);
        count++;
       }

       //Infinite loop
       // while (true){
            // your code goes here
       // }
    
    //Do While Looop
    // do {
    //     statement(s)
    // } while (expression);
    count = 1;
    do{
        System.out.println("Count is : "+count);
        count++;
    }while(count <= 10);
    
    }
}
