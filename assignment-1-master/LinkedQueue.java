package mr223_assign1;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedQueue implements IntQueue {
    private Node tail = null;
    private Node head = null;
    private int size = 0;


    public LinkedQueue() {

    }


    @Override
    public int size() {
        return size;
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public void enqueue(int element) {
        if (head == null) {
            head = new Node(element);
            tail = head;
        } else {
            tail.next = new Node(element);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public int dequeue() throws EmptyStackException {
        if (isEmpty()){
            throw new EmptyStackException();
        }else {
            Node first = head;
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

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        Node currentNode = head;
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
        private Node current = head;

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
