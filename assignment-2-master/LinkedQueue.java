package mr223_assign2;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class LinkedQueue<T> implements Queue<T> {

    private Node<T> tail = null;
    private Node<T> head = null;
    private int Size = 0;


    public LinkedQueue() {

    }

    @Override
    public int size() {
        return Size;
    }

    @Override
    public boolean isEmpty() {
        return Size == 0;
    }

    @Override
    public void enqueue(T element) {
        if (head == null) {
            head = new Node<T>(element);
            tail = head;
        } else {
            tail.next = new Node<T>(element);
            tail = tail.next;
        }
        Size++;
    }

    @Override
    public T dequeue() throws EmptyStackException {
        if (isEmpty()){
            throw new EmptyStackException();
        }else {
            Node<T> first = head;
            head = head.next;
            Size--;
            return first.value;
        }
    }

    @Override
    public T first() throws EmptyStackException {
        if (!isEmpty()) {
            return head.value;
        }
        throw new EmptyStackException();
    }

    @Override
    public T last() {
        if (!isEmpty()) {
            return tail.value;
        }
        throw new EmptyStackException();
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        Node<T> currentNode = head;
        while (currentNode != null) {
            str.append(" " + currentNode.value);
            currentNode = currentNode.next;
        }
        str.append(" ]");
        return str.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterable();
    }

    private class Iterable implements Iterator<T> {
        private Node<T> current = head;

        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() throws NoSuchElementException {
            if (current == null) {
                throw new NoSuchElementException();
            }
            T value = current.value;
            current = current.next;
            return value;
        }

    }
}