package mr223_assign3;
public class PrintRecursive {
    public static void print(String str, int pos){
        if(pos < 0 || pos == str.length()){
            System.out.print(" ");
        }
        else{
            System.out.print(str.charAt(pos));
            print(str,pos+1);
        }
    }

    public static void printReverse(String str, int pos){
        if(pos < 0 || pos == str.length()){
            System.out.print(" ");
        }
        else{
            printReverse(str,pos+1);
            System.out.print(str.charAt(pos));
        }
    }

    public static void main(String[] args){
        String str = "Hello Everyone!";
        print(str,0);
        System.out.println(); // Line break
        printReverse(str,0);
    }
}