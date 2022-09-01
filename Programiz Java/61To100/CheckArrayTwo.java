import java.util.Arrays;

//Check if an array contains a given value for non-primitive types
public class CheckArrayTwo {
    public static void main(String[] args) {
        String[] strings = {"One", "Two", "Three", "Four", "Five", "Six"};
        String toFind = "Four";

        boolean found = Arrays.stream(strings).anyMatch(t -> t.equals(toFind));

        if(found)
            System.out.println(toFind+" is found");
        else
            System.out.println(toFind+" is found");
    }
}
