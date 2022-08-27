package JavaProgramming2022;

import java.util.Scanner;

public class No_Time_To_Wait {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), H = sc.nextInt(), x = sc.nextInt();
        int[] T = new int[N];
        for(int i=0;i<N;i++){
            T[i] = sc.nextInt();
        }

        for(int i=0;i<N;i++){
            if(T[i]+x >= H){
                System.out.println("YES");
                break;
            }
            if(i == N-1){
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
