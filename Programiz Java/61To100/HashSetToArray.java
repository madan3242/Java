import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetToArray {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("c");
        set.add("b");

        String[] array = new String[set.size()];
        set.toArray(array);

        System.out.println("Array: "+Arrays.toString(array));
    }
}
