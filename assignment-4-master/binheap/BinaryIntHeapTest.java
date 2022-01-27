package mr223_assign4.binheap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class BinaryIntHeapTest {

    @Test
    public void insert() {
        BinaryIntHeap heap = new BinaryIntHeap(9);
        int size = 9;
        heap.insert(15);
        heap.insert(5);
        heap.insert(65);
        heap.insert(45);
        heap.insert(99);
        heap.insert(250);
        heap.insert(1);
        heap.insert(8);
        heap.insert(10);
        assertEquals(size,heap.size());
        try {
            System.out.println("The current size of the heap after inserting elements is: "+heap.size());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void pullHighest() {
        BinaryIntHeap heap = new BinaryIntHeap(10);
        heap.insert(5);
        heap.insert(2000);
        heap.insert(26);
        heap.insert(45);
        heap.insert(2020);
        int expected = 2020;
        try {
            assertEquals(expected, heap.pullHighest());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
   public void size() {
        BinaryIntHeap heap = new BinaryIntHeap(6);
        assertEquals(0, heap.size());
        heap.insert(10);
        assertEquals(1, heap.size());
        heap.insert(5);
        heap.insert(8);
        assertEquals(3, heap.size());
        heap.insert(1378);
        assertEquals(4, heap.size());
        heap.insert(1999);
        assertEquals(5, heap.size());
    }
    @Test
    public void isEmpty() {
        BinaryIntHeap heap = new BinaryIntHeap(1);
        heap.insert(10);
       assertFalse(heap.isEmpty());
    }
}