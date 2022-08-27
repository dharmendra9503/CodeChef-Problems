package JavaProgramming2022;

import java.util.Scanner;

public class Tyre_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), M = sc.nextInt();
            System.out.println(N*2 + M*4);
        }
        sc.close();
    }
}
