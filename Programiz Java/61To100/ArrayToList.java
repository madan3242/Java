import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] array = {"C", "C++", "Java"};
        System.out.println("Array : "+Arrays.toString(array));

        List languages = new ArrayList(Arrays.toString(array));

        System.out.println("List : "+languages);
    }
}
