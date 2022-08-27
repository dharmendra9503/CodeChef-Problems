package JavaProgramming2022;

import java.util.Scanner;

public class Mask_Policy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), A = sc.nextInt();
            System.out.println(Math.min(A, (N-A)));
        }
        sc.close();
    }
}
