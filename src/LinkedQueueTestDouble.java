


import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

class LinkedQueueTestDouble {

    @Test
    public void testSizeWhenEmpty() {
        LinkedQueue<Double> linkedQueue = new LinkedQueue<>();
        assertEquals(0, linkedQueue.size());
    }

    @Test
    public void testQueueIsEmpty() {
        LinkedQueue<Double> linkedQueue = new LinkedQueue<>();
        assertEquals(true, linkedQueue.isEmpty());
    }

    @Test
    public void testEnqueue() {
        LinkedQueue<Double> linkedQueue = new LinkedQueue<>();

        linkedQueue.enqueue(5.5);
        assertEquals(false, linkedQueue.isEmpty());
        assertEquals(1, linkedQueue.size());



        linkedQueue.enqueue(5.8);
        assertEquals(false, linkedQueue.isEmpty());
        assertEquals(2, linkedQueue.size());
    }

    @Test
    public void testFirst() {
        LinkedQueue<Double> linkedQueue = new LinkedQueue<>();
        double firstValue = 5.5;
        double other = 7.3;

        linkedQueue.enqueue(firstValue);
        assertEquals(5.5, linkedQueue.first());

        linkedQueue.enqueue(other);
        assertEquals(5.5, linkedQueue.first());
    }

    @Test
    public void testFirstWhenEmptyStack() {
        LinkedQueue<Double> linkedQueue = new LinkedQueue<>();
        assertThrows(EmptyStackException.class, () -> linkedQueue.first());
    }

    @Test
    public void testDequeue() {
        LinkedQueue<Double> linkedQueue = new LinkedQueue<>();
        double value1 = 5.1;
        double value2 = 8.23;

        linkedQueue.enqueue(value1);
        linkedQueue.enqueue(value2);

        assertEquals(value1, linkedQueue.dequeue());

        assertEquals(value2, linkedQueue.dequeue());
    }

    @Test
    public void testLast() {
        LinkedQueue<Double> linkedQueue = new LinkedQueue<>();
        double firstValue = 5.96;
        double other = 7.22;

        // enqueueing
        linkedQueue.enqueue(firstValue);
        assertEquals(firstValue, linkedQueue.last());

        linkedQueue.enqueue(other);
        assertEquals(other, linkedQueue.last());

        // dequeueing
        linkedQueue.dequeue();
        assertEquals(other, linkedQueue.last());
    }

    @Test
    public void testLasttWhenEmptyStack() {
        LinkedQueue<Double> linkedQueue = new LinkedQueue<>();
        assertThrows(EmptyStackException.class, () -> linkedQueue.last());
    }

    @Test
    public void testIterator() {
        LinkedQueue<Double> linkedQueue = new LinkedQueue<>();

        linkedQueue.enqueue(1.1);
        linkedQueue.enqueue(2.2);
        linkedQueue.enqueue(3.3);

        Iterator<Double> iter = linkedQueue.iterator();
        assertEquals(true, iter.hasNext());
        assertEquals(1.1, iter.next());
        assertEquals(2.2, iter.next());
        assertEquals(3.3, iter.next());
        assertEquals(false, iter.hasNext());

        assertThrows(NoSuchElementException.class, () -> iter.next());
    }


}
