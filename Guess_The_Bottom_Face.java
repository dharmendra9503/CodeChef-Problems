package JavaProgramming2022;

import java.util.Scanner;

public class Guess_The_Bottom_Face {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt();
            System.out.println(7-X);
        }
        sc.close();
    }
}
