package JavaProgramming2022;

import java.util.Scanner;

public class Chessboard_Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X1 = sc.nextInt(), X2 = sc.nextInt(), X3 = sc.nextInt(), X4 = sc.nextInt();
            int ans = Math.max(Math.abs(X1-X3), Math.abs(X2-X4));
            System.out.println(ans);
        }
        sc.close();
    }
}
