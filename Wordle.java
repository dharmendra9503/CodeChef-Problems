package JavaProgramming2022;

import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            String S = sc.next();
            String T = sc.next();
            for(int i=0;i<S.length();i++){
                if(S.charAt(i) == T.charAt(i)){
                    System.out.print("G");
                }
                else{
                    System.out.print("B");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
