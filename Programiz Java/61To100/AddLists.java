// Join Two Lists using addAll()

import java.util.ArrayList;
import java.util.List;

public class AddLists {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("b");

        List<String> list2 = new ArrayList<String>();
        list2.add("d");
        list2.add("e");

        List<String> joined = new ArrayList<String>();
        
        joined.addAll(list1);
        joined.addAll(list2);

        System.out.println("List 1 : " + list1);
        System.out.println("List 2 : " + list2);
        System.out.println("List 1 + List 2 : " + joined);
    }
}
