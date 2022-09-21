import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTwo {
    public static void main(String[] args) {
        ArrayList alist1 = new ArrayList();
        alist1.add("One");
        alist1.add(2);
        alist1.add("Three");
        alist1.add(true);

        //Read all values using iterator
        Iterator i = alist1.iterator();
        while(i.hasNext()){
            System.out.println(i.next()); //get the element and move to the next element
        }

        System.out.println("--------------------------------------");
        ArrayList<Integer> alist2 = new ArrayList<Integer>();
        alist2.add(1);
        alist2.add(5);
        alist2.add(7);
        alist2.add(3);
        alist2.add(2);
        alist2.add(9);
        alist2.add(0);
        alist2.add(6);

        Iterator i2 = alist2.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }

        // Sorting the elements
        System.out.println("Sort elements");
        Collections.sort(alist2);
        System.out.println(alist2);

        // Sort reverse order
        System.out.println("Sort reverse order");
        Collections.sort(alist2, Collections.reverseOrder());
        System.out.println(alist2);

        // Shuffle values
        System.out.println("Shuffle elements");
        Collections.shuffle(alist2);
        System.out.println(alist2);


        // System.out.println("Shuffle elements");
        // Collections.shuffle(alist2);
        // System.out.println(alist2);
        // System.out.println("Shuffle elements");
        // Collections.shuffle(alist2);
        // System.out.println(alist2);



        // Collections.reverse(alist2);
        // System.out.println(alist2);

        // System.out.println("-------------------------");
        // while(i2.hasNext()){ 
        //     System.out.println(i2.next());
        // }
    }
}
