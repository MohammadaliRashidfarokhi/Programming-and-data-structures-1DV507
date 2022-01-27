package mr223_assign1;

import java.util.Iterator;

public class QueueMain {

    public static void main(String[] args) {

        LinkedQueue queue = new LinkedQueue();

        queue.enqueue(1378);
        queue.enqueue(1999);
        queue.enqueue(1995);
        queue.enqueue(2020);
        queue.enqueue(2019);

        System.out.println("Full \"Queue\"" + queue.toString());

        System.out.println("\"First:\"" + queue.first());
        System.out.println("\"Last\":" + queue.last());

        System.out.println("Removing");
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();

        if (queue.isEmpty()) {
            System.out.println("No elements left");
        } else {
            System.out.println("Queue has space");

        }
    }
}