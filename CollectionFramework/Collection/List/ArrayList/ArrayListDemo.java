// import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        List all = new ArrayList();

        //How add induvidual values to arrayList
        all.add(true);
        all.add(false);

        al.add(10);
        al.add("twenty");
        al.add("twenty");
        al.add(true);
        al.add(null);
        
        System.out.println("ArrayList 1 "+ al);
        System.out.println("ArrayList 2 "+all);

        //How add collection to arrayList
        al.addAll(all);

        System.out.println("ArrayList 1 + ArrayList 2 "+al);

        // Find size of array list - size() method

        System.out.println("Size of Array List 1 is "+al.size());

        //To get specific value - get()

        System.out.println("Value at index 1 "+al.get(1));

        // To search element - contains()

        System.out.println(al.contains("twenty1"));

        // To check empty or not

        System.out.println("ArrayList is empty or not "+al.isEmpty());

        // Reading Array List elements

        System.out.println("Values Array List are : ");
        for(int i = 0; i < al.size() - 1; i++){
            System.out.println(al.get(i));
        }
        System.out.println("-----------------------------");
        for(Object o : al){
            System.out.println(o);
        }



        




        // ArrayList<Integer> al2 = new ArrayList<Integer>(); //Allowed only Integers

        // ArrayList<String> al3 = new ArrayList<String>(); //Allowed only String

        // List<Integer> al4 = new ArrayList<Integer>();
    }
}