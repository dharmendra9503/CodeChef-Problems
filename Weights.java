package JavaProgramming2022;

import java.util.Scanner;

public class Weights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int W = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt();
            if(W == X || W == Y || W == Z || W == (X+Y) || W == (Y+Z) || W == (X+Z) || W == (X+Y+Z)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
