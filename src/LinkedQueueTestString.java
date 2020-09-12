
import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

class LinkedQueueTestString {

    @Test
    public void testSizeWhenEmpty() {
        LinkedQueue<String> linkedQueue = new LinkedQueue<>();
        assertEquals(0, linkedQueue.size());
    }

    @Test
    public void testQueueIsEmpty() {
        LinkedQueue<String> linkedQueue = new LinkedQueue<>();
        assertEquals(true, linkedQueue.isEmpty());
    }

    @Test
    public void testEnqueue() {
        LinkedQueue<String> linkedQueue = new LinkedQueue<>();

        linkedQueue.enqueue("Some string");
        assertEquals(false, linkedQueue.isEmpty());
        assertEquals(1, linkedQueue.size());


        linkedQueue.enqueue("Other string");
        assertEquals(false, linkedQueue.isEmpty());
        assertEquals(2, linkedQueue.size());
    }

    @Test
    public void testFirst() {
        LinkedQueue<String> linkedQueue = new LinkedQueue<>();

        linkedQueue.enqueue("First string");
        assertEquals("First string", linkedQueue.first());

        linkedQueue.enqueue("Other string");
        assertEquals("First string", linkedQueue.first());
    }

    @Test
    public void testFirstWhenEmptyStack() {
        LinkedQueue<String> linkedQueue = new LinkedQueue<>();
        assertThrows(EmptyStackException.class, () -> linkedQueue.first());
    }

    @Test
    public void testDequeue() {
        LinkedQueue<String> linkedQueue = new LinkedQueue<>();

        linkedQueue.enqueue("String");
        linkedQueue.enqueue("Other");

        assertEquals("String", linkedQueue.dequeue());

        assertEquals("Other", linkedQueue.dequeue());
    }

    @Test
    public void testLast() {
        LinkedQueue<String> linkedQueue = new LinkedQueue<>();
        String firstValue = "First";
        String other = "Other";

        //for enqueue
        linkedQueue.enqueue(firstValue);
        assertEquals("First", linkedQueue.last());

        linkedQueue.enqueue(other);
        assertEquals("Other", linkedQueue.last());

        // for dequeue
        linkedQueue.dequeue();
        assertEquals("Other", linkedQueue.last());
    }

    @Test
    public void testLasttWhenEmptyStack() {
        LinkedQueue<String> linkedQueue = new LinkedQueue<>();
        assertThrows(EmptyStackException.class, () -> linkedQueue.last());
    }

    @Test
    public void testIterator() {
        LinkedQueue<String> linkedQueue = new LinkedQueue<>();

        linkedQueue.enqueue("One");
        linkedQueue.enqueue("Two");
        linkedQueue.enqueue("Three");

        Iterator<String> iter = linkedQueue.iterator();
        assertEquals(true, iter.hasNext());
        assertEquals("One", iter.next());
        assertEquals("Two", iter.next());
        assertEquals("Three", iter.next());
        assertEquals(false, iter.hasNext());

        assertThrows(NoSuchElementException.class, () -> iter.next());
    }


}
