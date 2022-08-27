package JavaProgramming2022;

import java.util.Scanner;

public class Maximise_The_Tastiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            System.out.println(Math.max(a, b) + Math.max(c, d));
        }
        sc.close();
    }
}
