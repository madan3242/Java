import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Convert Array to Set
public class ArrayToHashset {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c"};
        Set<String> set = new HashSet<>(Arrays.asList(array));
        for(String s : array){
            System.out.println(s);
        }
        System.out.println("Set : "+set);
    }
}
