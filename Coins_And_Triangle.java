package JavaProgramming2022;

import java.util.Scanner;

public class Coins_And_Triangle {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();

            int cnt = 1;
            while(N >= cnt){
                N = N-cnt;
                cnt++;
            }

            System.out.println(cnt-1);
        }

        sc.close();
    }
}
