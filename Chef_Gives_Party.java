package JavaProgramming2022;

import java.util.Scanner;

public class Chef_Gives_Party {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int X = sc.nextInt(), K = sc.nextInt();

            if(N*X > K){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
