package JavaProgramming2022;

import java.util.Scanner;

public class Lucky_Seven {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(s.charAt(6));
        sc.close();
    }
}
