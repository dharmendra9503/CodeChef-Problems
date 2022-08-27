package JavaProgramming2022;

import java.util.Scanner;

public class Expiring_Bread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), M = sc.nextInt(), K = sc.nextInt();
            if(N <= M*K){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
