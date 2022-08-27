package JavaProgramming2022;

import java.util.Scanner;

public class Equal_Card_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int K = sc.nextInt();

            System.out.println(52%K);

        }
        sc.close();
    }
}
