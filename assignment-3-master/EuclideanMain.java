package mr223_assign3;

import java.util.Scanner;

public class EuclideanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\"First number:\"");
        int n1=scanner.nextInt();
        System.out.print("\"Second:\"");
        int n2=scanner.nextInt();
        System.out.print("GCD("+n1+","+n2+")= "+GCD(n1,n2));
    }


    static int GCD(int M,int N){
        if(N==0){
            return M;
        }
        return GCD(N,M%N);
    }
}