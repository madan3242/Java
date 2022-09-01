import java.util.concurrent.TimeUnit;

// Java Program to Convert Milliseconds to Minutes and Seconds

public class ConvertMilliToMin {
    public static void main(String[] args) {
        long milliseconds = 100000000;
        
        long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);

        System.out.println(milliseconds+ " Milliseconds = "+seconds);

        long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);

        System.out.println(milliseconds+ " Milliseconds = "+minutes);
    }
}
