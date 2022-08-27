package JavaProgramming2022;

import java.util.Scanner;

public class Fill_The_Grid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), M = sc.nextInt();

            int row = N/2;
            int col = M/2;

            int grid = row*col*4;

            System.out.println((N*M)-grid);
        }
        sc.close();
    }
}
