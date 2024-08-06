import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        //Create a queue to store integers
        Queue<Integer> queue = new LinkedList<>();

        //Enqueue elements to the Queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        System.out.println(queue);

        //Access and print the front element of the Queue

        System.out.println("Front element :"+queue.peek());

        //Dequeue elements from the Queue and print them
        while(!queue.isEmpty())
        {
           int element= queue.poll();
            System.out.println("Dequeued element: "+element);
        }

        System.out.println("Is Queue is empty? ->"+queue.isEmpty());


    }
}
