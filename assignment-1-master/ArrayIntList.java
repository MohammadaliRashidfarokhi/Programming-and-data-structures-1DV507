package mr223_assign1;

public class ArrayIntList extends AbstractIntCollection implements IntList{

    private static final int capacity = 0;
    private int size=0;
    private int[] values;

    public ArrayIntList (int capacity) {
        values = new int[capacity];
    }
    public void setSize() {
        super.size = size;
    }
    public void setValues() {
        super.values= values;
    }

    @Override
    public void add(int n) {
        values[size] = n;
        size++;
        if(size==values.length) {
            resize();
        }
    }

    @Override
    public void addAt(int h, int index) throws IndexOutOfBoundsException {
        if (checkIndex(index, size+1)==false)
            throw new IndexOutOfBoundsException(index+" out of bounds");
        if(size+1>values.length) {
            //increase size
            resize();
        }
        //shift right
        for(int i=size; i>index; i--)
            values[i] = values[i-1];
        size++;
        values[index] = h;
    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        if(index<0)
            if(index>=size) throw new IndexOutOfBoundsException();

        for ( int i=index;i<size; i++)
            values [ i ] = values[ i+1];
        size--;

    }

    @Override
    public int get(int index) throws IndexOutOfBoundsException {
        if (checkIndex(index, size)==false)
            throw new IndexOutOfBoundsException();
        return values[index];
    }

    @Override
    public int indexOf(int n) {
        for ( int x=0;x<size; x++)
            if (values[x]==n) {
                return x;
            }
        return -1;
    }
    public void print() {
        for(int i =0; i<size;i++);
        int c = 0;
        System.out.println(values[c]);
    }
}
