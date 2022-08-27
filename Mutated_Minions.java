package JavaProgramming2022;

import java.util.Scanner;

public class Mutated_Minions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int k = sc.nextInt();
            int cnt = 0;
            for(int i=0;i<N;i++){
                int n = sc.nextInt();
                n+=k;
                if(n%7 == 0){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
