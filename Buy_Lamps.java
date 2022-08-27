package JavaProgramming2022;

import java.util.Scanner;

public class Buy_Lamps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), K = sc.nextInt();
            int X = sc.nextInt(), Y = sc.nextInt();

            int amount = K*X;
            N = N-K;

            if (X < Y) {
                amount += X*N;
            }
            else{
                amount += Y*N;
            }
            System.out.println(amount);
        }
        sc.close();
    }
}
