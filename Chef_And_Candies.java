package JavaProgramming2022;

import java.util.Scanner;

public class Chef_And_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), X = sc.nextInt();
            if(X >= N){
                System.out.println("0");
            }
            else {
                int rest = N - X;
                int pac = rest % 4;
                if(pac > 0) {
                    System.out.println((rest / 4) + 1);
                }
                else{
                    System.out.println(rest / 4);
                }
            }
        }
        sc.close();
    }
}
