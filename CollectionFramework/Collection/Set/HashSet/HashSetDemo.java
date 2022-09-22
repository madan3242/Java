import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;

public class HashSetDemo{
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(10);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(50);
        System.out.println(hs);
        System.out.println("-----------");
        Iterator i1 = hs.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }

        List l = new ArrayList(hs);
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);

        // Collections.sort(hs);
        // System.out.println(hs);

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(10);
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        lhs.add(50);
        lhs.add(50);
        System.out.println(lhs);

        System.out.println("-----------");
        Iterator i = lhs.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        // Collections.sort(lhs);

        
    }
}