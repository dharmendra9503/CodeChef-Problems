package JavaProgramming2022;

import java.util.Scanner;

public class Digit_Sum_Parities {

    static int parity(int n){
        int ans = 0;
        while(n>0){
            ans += n%10;
            n = n/10;
        }
        return ans%2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(), N;
        while(T-- > 0){
            N = sc.nextInt();
            if(parity(N) != parity(N+1)){
                System.out.println(N+1);
            }
            else{
                System.out.println(N+2);
            }
        }
        sc.close();
    }
}
