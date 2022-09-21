import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTwo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(10);
        ll.add(20);
        ll.add(40);
        ll.add(10);
        ll.add(30);

        Iterator i = ll.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("Sorting");
        Collections.sort(ll);
        System.out.println(ll);

        System.out.println("Reverse sorting");
        Collections.sort(ll, Collections.reverseOrder());
        System.out.println(ll);

        System.out.println("Shuffle");
        Collections.shuffle(ll);
        System.out.println(ll);
    }
}
