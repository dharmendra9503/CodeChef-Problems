package JavaProgramming2022;

import java.util.Scanner;

public class Naive_Chef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
            int[] x = new int[N];
            for(int i=0;i<x.length;i++){
                x[i] = sc.nextInt();
            }

            int c1 = 0, c2 = 0;
            for(int i=0;i<N;i++){
                if(A == x[i]){
                    c1++;
                }
                if(B == x[i]){
                    c2++;
                }
            }

            double ans = ((float)c1/N)*((float)c2/N);
            System.out.println(String.format("%.10f", ans));

        }
        sc.close();
    }
}
