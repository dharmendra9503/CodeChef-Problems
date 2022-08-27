package JavaProgramming2022;

import java.util.Scanner;

public class Covid_And_Theatre_Tickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), M = sc.nextInt();
            System.out.println(((N+1)/2)*((M+1)/2));
        }
        sc.close();
    }
}
