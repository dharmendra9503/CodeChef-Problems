package JavaProgramming2022;

import java.util.Scanner;

public class Email_Reminders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int U = sc.nextInt();

        System.out.println(N-U);
        sc.close();
    }
}
