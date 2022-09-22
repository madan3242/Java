import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        System.out.println(pq.peek());


        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.offer("A");

        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
