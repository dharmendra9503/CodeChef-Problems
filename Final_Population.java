package JavaProgramming2022;

import java.util.Scanner;

public class Final_Population {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt();
            System.out.println(X+Z-Y);
        }
        sc.close();
    }
}
