package JavaProgramming2022;

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt(), B = sc.nextInt();
            int tot = A+B;
            int third = 21-tot;
            if(third >=1 && third <=10){
                System.out.println(third);
            }
            else{
                System.out.println("-1");
            }
        }
        sc.close();
    }
}
