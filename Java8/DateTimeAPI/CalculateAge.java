import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate dob = LocalDate.of(1999, 06, 21);
        Period p = Period.between(dob, today);
        System.out.println(p);
        System.out.println(p.getYears() + " Years " + p.getMonths() +" Months "+p.getDays()+" Days");
    }
}
