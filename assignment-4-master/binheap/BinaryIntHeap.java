package mr223_assign4.binheap;
/*
Lecture slides
https://www.geeksforgeeks.org/
*/
import java.util.*;
public class BinaryIntHeap implements BinaryHeap {

    private int[] heap;
    private int heapSize;


    // Constructor to create empty heap
    public BinaryIntHeap(int h) {
        heapSize = 0;
        heap = new int[h+1];
        Arrays.fill(heap, -1);

    }

    @Override
    public boolean isEmpty(){// true if heap is empty
        return heapSize==0;
    }


    public boolean isFull(){
        return heapSize == heap.length;
    }

    @Override
    public int size(){
        return heapSize;
    }


    private int parent(int i){
        return (i-1)/2;
    }

    private int kthChild(int i,int k){
        return 2*i  +k;
    }

@Override
    public void insert(int n){ //Add n to heap
        if(isFull())
            throw new NoSuchElementException("Heap is full,no more space for inserting new elements");
        heap[heapSize++] = n;
        heapifyUp(heapSize-1);
    }

    public int delete(int x) {
        if(isEmpty())
            throw new NoSuchElementException("Heap is empty,no more element has been left to be deleted");
        int key = heap[x];
        heap[x] = heap[heapSize -1];
        heapSize--;
        heapifyDown(x);
        return key;
    }

    private void heapifyUp(int i) {
        int temp = heap[i];
        while(i>0 && temp > heap[parent(i)]){
            heap[i] = heap[parent(i)];
            i = parent(i);
        }
        heap[i] = temp;
    }
    private void heapifyDown(int i) {
        int child;
        int temp = heap[i];
        while(kthChild(i, 1) < heapSize){
            child = maxChild(i);
            if(temp < heap[child]) {
                heap[i] = heap[child];
            }
            else
                break;
            i = child;
        }
        heap[i] = temp;
    }

    private int maxChild(int i){
        int leftChild = kthChild(i, 1);
        int rightChild = kthChild(i, 2);
        return heap[leftChild]>heap[rightChild]?leftChild:rightChild;
    }

@Override
    public int pullHighest(){ // return and remove element with highest priority
        if(isEmpty())
            throw new NoSuchElementException("Heap is empty");
        int a = heap[0];
        delete(a);
        return a;
    }
}