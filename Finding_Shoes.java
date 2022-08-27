package JavaProgramming2022;

import java.util.Scanner;

public class Finding_Shoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), M = sc.nextInt();
            int total = 2*N;
            if(N <= M){
                total = total - N;
            }
            else{
                total = total-M;
            }
            System.out.println(total);
        }
        sc.close();
    }
}
