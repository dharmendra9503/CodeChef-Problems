package JavaProgramming2022;

import java.util.Scanner;

public class Chefland_Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int R1 = sc.nextInt(), R2 = sc.nextInt(), R3 = sc.nextInt(), R4 = sc.nextInt();
            if(R1 == 0 && R2 == 0 && R3 == 0 && R4 == 0){
                System.out.println("IN");
            }
            else{
                System.out.println("OUT");
            }
        }
        sc.close();
    }
}
