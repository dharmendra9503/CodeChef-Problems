package JavaProgramming2022;

import java.util.Scanner;

public class Watching_Movie_At_2x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(), Y = sc.nextInt();
        System.out.println(X-(Y/2));
        sc.close();
    }
}
