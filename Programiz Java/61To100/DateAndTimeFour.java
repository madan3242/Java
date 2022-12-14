import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

// Get Current Date time in localized style

public class DateAndTimeFour {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        String formatted = current.format(formatter);

        System.out.println("Current Date is : "+formatted);
    }
}
