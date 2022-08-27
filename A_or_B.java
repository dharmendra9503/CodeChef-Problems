package JavaProgramming2022;

import java.util.Scanner;

public class A_or_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt();

            int one = (500-X*2) + (1000- ((X+Y)*4));
            int sec = (1000-Y*4) + (500- ((X+Y)*2));
            System.out.println(Math.max(one,sec));
        }
        sc.close();
    }
}
