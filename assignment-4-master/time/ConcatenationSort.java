package mr223_assign4.time;


import java.util.Comparator;
import java.util.Date;
import java.util.Random;

public class ConcatenationSort {
   public  int arraySize = 100000;
   public int[] IntegerArray = new int[arraySize];
   public  String[] StringArray = new String[arraySize];
    public  Random rand = new Random();

    public ConcatenationSort(){
        for (int i = 1; i < 6; i++){
            System.out.println("===== "+"\"EXECUTION\""+" "+ i+" =====");
            arrayBu();
            System.out.println("Integer Array Size= "+ IntegerArray.length+"\tTime = "+ IntegerArrayTi(IntegerArray));
            System.out.println("String Array Size= "+ StringArray.length +"\tTime = "+ stringArrayTi(StringArray));
            resize();
        }
    }
    public int[] insertionSort(int[] n){
        int next,position;
        for(int i=1; i<n.length; i++) {
             position = n[i];
             next = i-1;

            while(next>=0 && n[next]>position){
                n[next + 1] = n[next];
                next = next - 1;
            }
            n[next + 1] = position;
        }
        return n;
    }

    public String[] insertionSort(String[] st, Comparator<String> com){
        String str;
        int j;
        for (int i = 1; i < st.length ; i++) {
             str = st[i];
             j = i;
            while(j > 0 && com.compare(st[j - 1], str) > 0){
                st[j] = st[j-1];
                j--;
            }
            st[j] = str;
        }
        return st;
    }

   public long IntegerArrayTi(int[] intArray){
        long time = new Date().getTime();
        insertionSort(intArray);
        long timeAft = new Date().getTime();
        long elapse = timeAft - time;
       return elapse;
    }
    public void stringBu(){
        StringBuilder stringBuilder = new StringBuilder();
        int x = 10;
        while (x-- != 0){
            stringBuilder.append((char) rand.nextInt(300));
        }
    }

    public long stringArrayTi(String[] StringArray){
        Comparator<String> c = String::compareTo;
        long time = new Date().getTime();
        insertionSort(StringArray, c);
        long timeAft = new Date().getTime();
        long elapse = timeAft - time;
        return elapse;
    }
    public void resize(){
        int[] temp = IntegerArray;
        IntegerArray = new int[2*temp.length];
        String[] str = StringArray;
        StringArray = new String[2*str.length];
    }

    public void arrayBu(){
        StringBuilder stringBuilder = new StringBuilder();
        int n;
        n = arraySize + IntegerArray.length;
        for (int i = 0; i < IntegerArray.length; i++){
            IntegerArray[i] = (int) (Math.random()*n);
            stringBu();
            StringArray[i] = stringBuilder.toString();
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

}