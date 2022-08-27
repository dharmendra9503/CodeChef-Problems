package JavaProgramming2022;

import java.util.Scanner;

public class Discus_Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();

            int max = Math.max(A, B);
            max = Math.max(max, C);
            System.out.println(max);
        }
        sc.close();
    }
}
