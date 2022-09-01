package JavaProgramming2022;

import java.util.Scanner;

public class Ticket_Fine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), P = sc.nextInt(), Q = sc.nextInt();
            System.out.println((P-Q)*X);
        }
        sc.close();
    }
}
