package JavaProgramming2022;

import java.util.Scanner;

public class RCB_And_Playoffs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt();
            if(X+(Z*2) >= Y){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
