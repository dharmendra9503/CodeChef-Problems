package JavaProgramming2022;

import java.util.Scanner;

public class Balls_And_Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), K = sc.nextInt();

            int S = (K*(K+1))/2;
            if(N >= S){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
