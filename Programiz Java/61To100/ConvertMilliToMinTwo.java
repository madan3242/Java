// Milliseconds to Seconds/Minutes Using Mathematical Formula

public class ConvertMilliToMinTwo {
    public static void main(String[] args) {
        long milliseconds = 100000000;

        long seconds = milliseconds/1000;
        System.out.println(milliseconds+ " milliseconds = "+seconds+" seconds");

        long minutes = seconds / 60;
        System.out.println(milliseconds+ " milliseconds = "+minutes+" minutes");
    }
}
