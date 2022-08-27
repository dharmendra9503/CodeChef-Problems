package JavaProgramming2022;

import java.util.Scanner;

public class Fill_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), K = sc.nextInt(), M = sc.nextInt();
            int put = K*M;

            if(N%put == 0) {
                System.out.println(N/put);
            }
            else{
                System.out.println(N/put+1);
            }
        }
        sc.close();
    }
}
