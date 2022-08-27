package JavaProgramming2022;

import java.util.Scanner;

public class Helping_Chef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            if(N < 10){
                System.out.println("Thanks for helping Chef!");
            }
            else{
                System.out.println("-1");
            }
        }
        sc.close();
    }
}
