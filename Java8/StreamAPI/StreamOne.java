import java.util.stream.Stream;

public class StreamOne{
    public static void main(String[] args) {
        Stream st = Stream.of(10, 20, 30, 40, 50);
        
        st.forEach(System.out::println);
    }
}