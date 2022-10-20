import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        // List<String> newNames =  languages.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        // languages.stream().map(n -> n.toUpperCase()).filter(n -> n.startsWith("C")).forEach(System.out::println);
        languages.stream().map(n -> n.toUpperCase()).forEach(System.out::println);
    }
}
