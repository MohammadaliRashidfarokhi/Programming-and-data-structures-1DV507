package mr223_assign3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class SortingAlgorithmTest {
    int[] intg = {993,55,0,88,3,6,2};
    Comparator<String> c= String::compareToIgnoreCase;
    String[] str= {"z","b","g","a","f","i"};
    SortingAlgorithm alg = new SortingAlgorithm();
    @Test
    void insertionSort() {
        assertEquals("[0, 2, 3, 6, 55, 88, 993]", Arrays.toString(alg.insertionSort(intg)));
    }

    @Test
    void InsertionSortStr() {
        assertEquals("[a, b, f, g, i, z]",Arrays.toString(alg.insertionSort(str,c)));
    }
}