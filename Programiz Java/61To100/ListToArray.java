// Java Program to Convert a List to Array and Vice Versa
import java.util.ArrayList;

public class ListToArray {
    public static void main(String[] args) {
        ArrayList languages = new ArrayList();
        languages.add("Java");
        languages.add("Javascript");
        languages.add("Python");
        System.out.println("Languages : "+languages);

        String[] arr = new String[languages.size()];

        languages.toArray(arr);
        System.out.println("Array: ");
        for(String s : arr){
            System.out.println(s);
        }
    }
}
