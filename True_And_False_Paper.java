package JavaProgramming2022;

import java.util.Scanner;

public class True_And_False_Paper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), K = sc.nextInt();
            System.out.println(N-K);
        }
        sc.close();
    }
}
