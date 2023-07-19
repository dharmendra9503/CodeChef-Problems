package JavaProgramming2022;

import java.util.Scanner;

public class Puzzle_Hunt {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if(N > 5 && N < 9)
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }
}
