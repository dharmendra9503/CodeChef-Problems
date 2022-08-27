package JavaProgramming2022;

import java.util.Scanner;

public class Janmansh_And_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0) {
            int X = sc.nextInt(), Y = sc.nextInt();
            System.out.println(X*10 + Y*5);
        }
        sc.close();
    }
}
