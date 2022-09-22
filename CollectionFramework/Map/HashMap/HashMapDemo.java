import java.util.HashMap;

public class HashMapDemo{
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(101, "Acc1");
        hm.put(102, "Acc2");
        hm.put(103, "Acc3");
        hm.put(104, "Acc4");

        HashMap hm2 = new HashMap();
        hm2.put(105, "Acc5");
        hm2.put(106, "Acc6");

        hm.putAll(hm2);
        

        System.out.println(hm);

        System.out.println(hm.get(102));

        hm.remove(103);
        
        System.out.println(hm);

        System.out.println(hm.containsKey(101));
        
        System.out.println(hm.containsValue("Acc3"));




        //  HashMap hs2 = new HashMap(100, .10f);
    }
}