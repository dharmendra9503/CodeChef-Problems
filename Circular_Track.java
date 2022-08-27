package JavaProgramming2022;

import java.util.Scanner;

public class Circular_Track {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt(), B = sc.nextInt();
            int M = sc.nextInt();

            int ex1 = Math.abs(A-B);
            int ex2 = Math.abs(M-ex1);
            System.out.println(Math. min(ex1,ex2));
        }
        sc.close();
    }
}
