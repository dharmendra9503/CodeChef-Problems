package JavaProgramming2022;

import java.util.Scanner;

public class Economics_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int[] S = new int[N];
            int[] D = new int[N];

            for(int i=0;i<S.length;i++){
                S[i] = sc.nextInt();
            }
            for(int i=0;i<D.length;i++){
                D[i] = sc.nextInt();
            }

            int cnt = 0;
            for(int i=0;i<S.length;i++){
                if(S[i] == D[i]){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
