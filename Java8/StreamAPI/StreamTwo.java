import java.util.ArrayList;

public class StreamTwo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(25);
        al.add(48);
        al.add(12);
        al.add(8);
        al.add(33);
        al.add(20);
        al.add(3);

        al.stream().sorted()
                    .filter(v -> v % 2 == 0)
                    .forEach(v -> System.out.println(v));
    }
}
