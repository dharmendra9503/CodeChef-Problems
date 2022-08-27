package JavaProgramming2022;

import java.util.Scanner;

public class Chef_And_The_Hair_Salon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), M = sc.nextInt();
            System.out.println(N*M);
        }
        sc.close();
    }
}