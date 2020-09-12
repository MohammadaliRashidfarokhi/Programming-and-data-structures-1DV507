

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

class LinkedQueueA1TestCase {

    @Test
    public void testSizeWhenEmpty() {
        LinkedQueueA1 linkedQueueA1 = new LinkedQueueA1();
        assertEquals(0, linkedQueueA1.size());
    }

    @Test
    public void testQueueIsEmpty() {
        LinkedQueueA1 linkedQueueA1 = new LinkedQueueA1();
        assertEquals(true, linkedQueueA1.isEmpty());
    }

    @Test
    public void testEnqueue() {
        LinkedQueueA1 linkedQueueA1 = new LinkedQueueA1();
        int value1 = 1;
        int value2 = 5;

        linkedQueueA1.enqueue(value1);
        assertEquals(false, linkedQueueA1.isEmpty());
        assertEquals(1, linkedQueueA1.size());



        linkedQueueA1.enqueue(value2);
        assertEquals(false, linkedQueueA1.isEmpty());
        assertEquals(2, linkedQueueA1.size());
    }

    @Test
    public void testFirst() {
        LinkedQueueA1 linkedQueueA1 = new LinkedQueueA1();
        int firstValue = 5;
        int other = 7;

        linkedQueueA1.enqueue(firstValue);
        assertEquals(firstValue, linkedQueueA1.first());

        linkedQueueA1.enqueue(other);
        assertEquals(firstValue, linkedQueueA1.first());
    }

    @Test
    public void testFirstWhenEmptyStack() {
        LinkedQueueA1 linkedQueueA1 = new LinkedQueueA1();
        assertThrows(EmptyStackException.class, () -> linkedQueueA1.first());
    }

    @Test
    public void testDequeue() {
        LinkedQueueA1 linkedQueueA1 = new LinkedQueueA1();
        int value1 = 5;
        int value2 = 8;

        linkedQueueA1.enqueue(value1);
        linkedQueueA1.enqueue(value2);

        assertEquals(value1, linkedQueueA1.dequeue());

        assertEquals(value2, linkedQueueA1.dequeue());
    }

    @Test
    public void testLast() {
        LinkedQueueA1 linkedQueueA1 = new LinkedQueueA1();
        int firstValue = 5;
        int other = 7;

        // enqueueing
        linkedQueueA1.enqueue(firstValue);
        assertEquals(firstValue, linkedQueueA1.last());

        linkedQueueA1.enqueue(other);
        assertEquals(other, linkedQueueA1.last());

        // dequeueing
        linkedQueueA1.dequeue();
        assertEquals(other, linkedQueueA1.last());
    }

    @Test
    public void testLasttWhenEmptyStack() {
        LinkedQueueA1 linkedQueueA1 = new LinkedQueueA1();
        assertThrows(EmptyStackException.class, () -> linkedQueueA1.last());
    }

    @Test
    public void testIterator() {
        LinkedQueueA1 linkedQueueA1 = new LinkedQueueA1();

        linkedQueueA1.enqueue(1);
        linkedQueueA1.enqueue(2);
        linkedQueueA1.enqueue(3);

        Iterator<Integer> iter = linkedQueueA1.iterator();
        assertEquals(true, iter.hasNext());
        assertEquals(1, iter.next());
        assertEquals(2, iter.next());
        assertEquals(3, iter.next());
        assertEquals(false, iter.hasNext());

        assertThrows(NoSuchElementException.class, () -> iter.next());
    }
    @Test
    public void testToString(){
        LinkedQueueA1 linkedQueueA1 = new LinkedQueueA1();

        for(int i = 1; i < 11; i++){
            linkedQueueA1.enqueue(i);
        }
        String expected = "[ 1 2 3 4 5 6 7 8 9 10 ]";
        assertEquals(expected, linkedQueueA1.toString());
    }


}
