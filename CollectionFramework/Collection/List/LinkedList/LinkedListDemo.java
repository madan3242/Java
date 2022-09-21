import java.util.List;
import java.util.LinkedList;

public class LinkedListDemo{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        List lll = new LinkedList();

        //How add induvidual values to arrayList
        lll.add(true);
        lll.add(false);

        ll.add(10);
        ll.add("twenty");
        ll.add("twenty");
        ll.add(true);
        ll.add(null);



        
        System.out.println("LinkedList 1 "+ ll);
        System.out.println("LinkedList 2 "+ll);

        //How add collection to arrayList
        ll.addAll(lll);

        System.out.println("LinkedList 1 + LinkedList 2 "+ll);

        // Find size of array list - size() method

        System.out.println("Size of LinkedList 1 is "+ll.size());

        //To get specific value - get()

        System.out.println("Value at index 1 "+ll.get(1));

        // To search element - contains()

        System.out.println(ll.contains("twenty"));

        // To check empty or not

        System.out.println("Linkedlist is empty or not "+ll.isEmpty());

        // Reading Array List elements

        System.out.println("Values Linkedlist are : ");
        for(int i = 0; i < ll.size() - 1; i++){
            System.out.println(ll.get(i));
        }
        System.out.println("-----------------------------");
        for(Object o : ll){
            System.out.println(o);
        }
    }
}