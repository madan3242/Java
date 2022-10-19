import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamThree {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("C");
        languages.add("C++");
        languages.add("C#");
        languages.add("Python");
        languages.add("Go");
        languages.add("Ruby");
        languages.add("Swift");

        Stream<String> newNames =  languages.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        // languages.stream().map(n -> n.toUpperCase()).filter(n -> n.startsWith("C")).forEach(System.out::println);
    }
}
