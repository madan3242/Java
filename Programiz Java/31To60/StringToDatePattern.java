import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
// Convert String to Date using pattern formatters

public class StringToDatePattern {
    public static void main(String[] args) {
        String str = "August 30, 2017";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(str, formatter);

        System.out.println(str);
        System.out.println(date);
    }
}
