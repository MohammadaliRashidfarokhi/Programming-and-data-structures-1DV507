package mr223_assign4.count_words;

import java.util.Objects;

public class Word implements Comparable<Word>{
    private String word;

    public Word(String str){
        word = str;
    }
    @Override
    public int hashCode() {
        return word.toLowerCase().hashCode();
    }


    public int compareTo(Word w) {
        return word.compareToIgnoreCase(w.toString());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Word)) return false;
        Word wordNum1 = (Word) other;
        return Objects.equals(word, wordNum1.word);
    }

    public String toString() {
        return word;
    }
}