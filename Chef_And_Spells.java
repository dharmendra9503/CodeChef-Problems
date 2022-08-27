package JavaProgramming2022;

import java.util.Scanner;

public class Chef_And_Spells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
            int f1 = A+B, f2 = B+C, f3 = A+C;

            int f4 = Math.max(f1, f2);
            System.out.println(Math.max(f3, f4));
        }
        sc.close();
    }
}
