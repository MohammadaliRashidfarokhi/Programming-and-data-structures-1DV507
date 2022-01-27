package mr223_assign3;

import java.io.File;
import java.io.FilenameFilter;

public class PrintJavaMain {
    static int counter;

    static void myDirectory(File dir){
        if(dir.isDirectory()){
            printAllJavaFiles(dir);
            File[] file = dir.listFiles();

            for(File f: file){
                myDirectory(f);
            }
        }
    }

    private static void printAllJavaFiles(File directory) {
        FilenameFilter name = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }

        };
        File[] f = directory.listFiles(name);

        for (File x:f){
            long size = x.length();
            counter++;
            System.out.print(counter+" "+x.getName()+" has the size ");
            System.out.format("%d bytes",size);
            System.out.println();
        }
    }


    public static void main(String[] args){
        File myFiles = new File("C:\\Users\\Ali\\IdeaProjects\\1DV507");
        myDirectory(myFiles);
    }
}