package JavaProgramming2022;

import java.util.Scanner;

public class Chess_Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            long time = N*60;
            System.out.println(time/20);
        }
        sc.close();
    }
}
