package JavaProgramming2022;

import java.util.Scanner;

public class Chef_And_Water_Bottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int K = sc.nextInt();

            if(K/X > N) {
                System.out.println(N);
            }
            else {
                System.out.println(K / X);
            }
        }
        sc.close();
    }
}
