package mr223_assign4.count_words;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class IdentifyWordsMain {


    public static void main(String[] args) {
        try {
            List<String> word = Files.lines(Paths.get("C:\\Users\\Ali\\IdeaProjects\\1DV507\\src\\mr223_assign4\\count_words\\HistoryOfProgramming.txt")).collect(Collectors.toList());

            word.removeIf(s -> s == null || s.equals(" ") || s.length() == 0);
            PrintWriter write=new PrintWriter("C:\\Users\\Ali\\IdeaProjects\\1DV507\\src\\mr223_assign4\\count_words\\words.txt");

            for(String st: word) {
                String crNewLine = st.replaceAll("[-]", " ");
                crNewLine = crNewLine.replaceAll("[^a-zA-Z\\s]", "");
                write.println(crNewLine);
            }
            write.close();
            System.out.println("Finish");
        }
        catch (FileNotFoundException e) {
            System.out.println("Error opening/creating the file " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Error opening/creating the file " + e.getMessage());
        }

    }
}
