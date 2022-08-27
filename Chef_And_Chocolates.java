package JavaProgramming2022;

import java.util.Scanner;

public class Chef_And_Chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int C = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt();

            System.out.println((C-X)*Y);
        }
        sc.close();
    }
}
