

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedQueueA1 implements IntQueue {
    private NodeA1 tail = null;
    private NodeA1 head = null;
    private int size = 0;



    public LinkedQueueA1() {

    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size== 0;
    }


    @Override
    public void enqueue(int element) {
        if (head == null) {
            head = new NodeA1(element);
            tail = head;
        } else {
            tail.next = new NodeA1(element);
            tail = tail.next;
        }
        size++;
    }


    @Override
    public int dequeue() throws EmptyStackException {
        if (isEmpty()){
            throw new EmptyStackException();
        }else {
            NodeA1 first = head;
            head = head.next;
            size--;
            return first.value;
        }
    }

    @Override
    public int first() throws EmptyStackException {
        if (!isEmpty()) {
            return head.value;
        }
        throw new EmptyStackException();
    }

    @Override
    public int last() {
        if (!isEmpty()) {
            return tail.value;
        }
        throw new EmptyStackException();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        NodeA1 currentNode = head;
        while (currentNode != null) {
            str.append(" " + currentNode.value);
            currentNode = currentNode.next;
        }
        str.append(" ]");
        return str.toString();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterable();
    }

    private class Iterable implements Iterator<Integer> {
        private NodeA1 current = head;

        public boolean hasNext() {
            return current != null;
        }


        @Override
        public Integer next() throws NoSuchElementException {
            if (current == null) {
                throw new NoSuchElementException();
            }
            int data = current.value;
            current = current.next;
            return data;
        }

    }


}