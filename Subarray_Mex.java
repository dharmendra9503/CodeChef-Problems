package JavaProgramming2022;

import java.util.Scanner;

public class Subarray_Mex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), K = sc.nextInt(), X = sc.nextInt();
            if(X > K){
                System.out.println("-1");
            }
            else{
                int c = 0;
                for(int i=0;i<N;i++){
                    if(c == X){
                        c=0;
                    }
                    System.out.print(c+" ");
                    c++;
                }
            }
            System.out.println();

        }
        sc.close();
    }
}
