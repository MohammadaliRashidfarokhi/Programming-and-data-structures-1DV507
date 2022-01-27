package mr223_assign1;

import java.util.*;
import java.util.EmptyStackException;

public class Stack implements StringStack {
    private String[] array = new String[0];

    public int size() {
        return array.length;
    }

    // valid if stack is empty
    public boolean isEmpty() {
        return array.length == 0;
    }

    public void push(String element) {
        array = Arrays.copyOf(array, array.length+1);
        array[array.length-1] = element;
    }

    // getting rid of top element,
    public String pop() {
        if(array.length == 0) {
            throw new EmptyStackException();
        } else {
            String result = array[array.length-1];
            array = Arrays.copyOf(array, array.length-1);
            return result;
        }
    }

    public String peek() {
        if(array.length == 0) {
            throw new EmptyStackException();
        } else {
            return array[array.length-1];
        }
    }

    @Override
    public String toString() {
        String str = "{ ";
        for(int i=0; i < array.length; i++){
            str +=array[i];
            str += i == (array.length - 1) ? "" : ", ";
        }
        return str+" }";
    }
}



