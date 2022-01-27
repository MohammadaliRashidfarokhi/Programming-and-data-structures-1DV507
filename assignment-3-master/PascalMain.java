package mr223_assign3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PascalMain {
    public static int[] pascalRow(int n){
        int[] pasclist = new int[n+1];
        if(n==0){
            pasclist[0]=1;
            return pasclist;
        }
        else{
            int[] num = pascalRow(n-1);
            pasclist[0]= pasclist[n] = 1;
            for(int i = 1; i<n; i++){
                pasclist[i] = num[i-1]+num[i];
            }
        }
        return pasclist;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] pascrow = null;
        try{
            System.out.print("\"Number:\" ");
            int num = scanner.nextInt();
            pascrow = pascalRow(num);
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        assert pascrow != null;
        for(int n: pascrow){
            System.out.print(n+" ");
        }
        scanner.close();
    }
}
