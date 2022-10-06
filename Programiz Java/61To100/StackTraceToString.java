import java.io.PrintWriter;
import java.io.StringWriter;

public class StackTraceToString{
    public static void main(String[] args) {
        try{
            int division = 0 / 0;
        }catch(ArithmeticException ae){
            StringWriter sw = new StringWriter();
            ae.printStackTrace( new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            System.out.println(exceptionAsString);
        }
    }
}