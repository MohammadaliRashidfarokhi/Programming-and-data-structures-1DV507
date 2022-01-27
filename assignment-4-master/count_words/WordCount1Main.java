package mr223_assign4.count_words;


import java.io.File;
import java.util.*;

public class WordCount1Main {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\Ali\\IdeaProjects\\1DV507\\src\\mr223_assign4\\count_words\\words.txt"));

            ArrayList<Word> arrayList = new ArrayList<>();
            while (sc.hasNext()) {
                    arrayList.add(new Word(sc.next()));
            }
            Set<Word> hashSet = new HashSet<>(arrayList);
            Set<Word> treeSet = new TreeSet<>(arrayList);
            System.out.println("Number in TreeSet: " + "\n"+treeSet.size());
            System.out.println("Number in HashSet: " + "\n"+hashSet.size());
            System.out.println("TreeSet element: ");
            for (Word w : treeSet) {
                System.out.println(w.toString());
            }
        } catch (Exception e) {
            System.out.println(" Error: "+ e.getMessage());
        }
    }
}