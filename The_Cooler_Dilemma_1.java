package JavaProgramming2022;

import java.util.Scanner;

public class The_Cooler_Dilemma_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt(), M = sc.nextInt();
            if(X*M < Y){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
