package mr223_assign4.count_words;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCount2Main {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\Ali\\IdeaProjects\\1DV507\\src\\mr223_assign4\\count_words\\words.txt"));

            ArrayList<Word> arrayList = new ArrayList<>();
            HashWordSet hashWordSet = new HashWordSet();
            TreeWordSet treeWordSet = new TreeWordSet();

            while (sc.hasNext()) {
                    arrayList.add(new Word(sc.next()));
            }
            for (Word w : arrayList) {
                    hashWordSet.add(w);
                    treeWordSet.add(w);
            }
            System.out.println("Hashset size: " +"\n"+ hashWordSet.size());
            System.out.println("Hashset: " + hashWordSet.toString());
            System.out.println("\n======\n");
            System.out.println("TreeSet size: " +"\n"+ treeWordSet.size());
            System.out.println("TreeSet: " + treeWordSet.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}