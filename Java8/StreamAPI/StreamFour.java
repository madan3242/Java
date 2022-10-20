import java.util.ArrayList;

public class StreamFour {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(78);
        list.add(54);
        list.add(12);
        list.add(77);
        list.add(89);
        list.add(3);
        list.add(17);
        list.add(8);

        // list.stream().sorted()
        //             .filter(n -> n % 2 != 0)
        //             .forEach(v -> System.out.println(v));

        list.stream();

        // list.stream().forEach(System.out::println); //Double colon operator

        // list.stream().forEach(value -> System.out.println(value));

        // list.stream().sorted().forEach(System.out::println);

        list.stream().sorted().map(v -> return v += 10)


    }
}