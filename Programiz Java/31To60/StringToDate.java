import java.time.LocalDate;
// Java Program to Convert String to Date
import java.time.format.DateTimeFormatter;

public class StringToDate {
    public static void main(String[] args) {
        String str = "2021-08-30";
        LocalDate date = LocalDate.parse(str, DateTimeFormatter.ISO_DATE);

        System.out.println(str);
        System.out.println(date);
    }
}
