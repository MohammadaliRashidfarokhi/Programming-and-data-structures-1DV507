package mr223_assign1;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {

    private int size=0;
    private int[] stacks;

    public ArrayIntStack() {

    }

    public ArrayIntStack(int length) {
        this.stacks = new int[length];
    }

    public void add(int v) {
        stacks[size++] = v;
    }

    @Override
    public void push(int l) {
        values[size] = l;
        size++;
        if(size>=values.length) {
            //increase size
            resize();
        }
    }
    @Override
    public int pop() throws IndexOutOfBoundsException {
        if (size==0)
            throw new IndexOutOfBoundsException();
        int result =  values[size-1];
        for(int i=(size-1); i<size; i++) {
            //move elements
            values[i] = values[i+1];
        }
        size--;
        return result;
    }

    @Override
    public int peek() throws IndexOutOfBoundsException {
        if (size==0)
            throw new IndexOutOfBoundsException();
        return values[size-1];
    }

}
