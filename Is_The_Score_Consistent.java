package JavaProgramming2022;

import java.util.Scanner;

public class Is_The_Score_Consistent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt(), B = sc.nextInt();
            int C = sc.nextInt(), D = sc.nextInt();
            if((C-A)<0 || (D-B)<0){
                System.out.println("IMPOSSIBLE");
            }
            else{
                System.out.println("POSSIBLE");
            }
        }
        sc.close();
    }
}
