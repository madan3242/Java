import java.util.stream.Stream;

public class StreamOne{
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(new Integer[] {1, 2, 3, 4, 5, 6});
        stream.forEach((value) -> System.out.println(value));
    }
}