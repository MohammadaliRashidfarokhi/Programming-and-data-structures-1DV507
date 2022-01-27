package mr223_assign3;


import java.util.Arrays;
import java.util.Comparator;

public class SortingAlgorithm {
    public SortingAlgorithm(){

    }

    public int[] insertionSort(int[] in){
        int length = in.length;
        for(int i = 1;i<length;i++){
            int integ = in[i];
            int next = i-1;
            while(next >=0 && in[next]> integ){
                in[next+1]=in[next];
                next=next-1;
            }
            in[next+1]=integ;
        }
        return in;
    }

    public String[] insertionSort(String[] in, Comparator<String> c){
        int length = in.length;
        for(int i=1;i<length;i++){
            String str = in[i];
            int next = i;

            while(next>0 && c.compare(in[next-1],str) > 0){
                in[next]=in[next-1];
                next--;
            }
            in[next]=str;
        }
        return in;
    }
}
