

import java.util.EmptyStackException;
import java.util.Iterator;

public interface Queue<T> {

    int size();  // current queue size

    boolean isEmpty(); // true if queue is empty

    void enqueue(T element);   // add element at end of queue

    T dequeue() throws IndexOutOfBoundsException; // return and remove first element.

    T first() throws EmptyStackException; // return (without removing) first element

    T last();  // return (without removing) last element

    Iterator<T> iterator();



}
