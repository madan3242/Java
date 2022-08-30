import java.math.RoundingMode;
import java.text.DecimalFormat;

public class RoundANumberTwo {
    public static void main(String[] args) {
        //Round a Number using DecimalFormat
        double n = 1.3784568;
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(n));
    }
}
