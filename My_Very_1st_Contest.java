package JavaProgramming2022;

import java.util.Scanner;

public class My_Very_1st_Contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt(), B = sc.nextInt();
        System.out.println(N-A +" "+(N-A-B));
        sc.close();
    }
}
