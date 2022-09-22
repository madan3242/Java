import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HMap {
    public static void main(String[] args) {

        HashMap hm = new HashMap();

        hm.put(101, "Acc1");
        hm.put(102, "Acc2");
        hm.put(103, "Acc3");
        hm.put(104, "Acc4");

        System.out.println(hm);

        Set s = hm.keySet();
        System.out.println(s);

        Set s1 = hm.entrySet();
        System.out.println(s1);

        Iterator i = s1.iterator();
        while(i.hasNext()){
            // System.out.println(i.next());
            Map.Entry m1 = (Map.Entry) i.next();
            System.out.println(m1.getKey()+" "+m1.getValue());
        }

        // String str = new String("Hello");
        // System.out.println(str.subSequence(1, 3));
    }
}
