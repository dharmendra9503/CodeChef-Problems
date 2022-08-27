package JavaProgramming2022;

import java.util.Scanner;

public class The_Cooler_Dilemma_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt();
            if(X == 0){
                System.out.println("0");
            }
            else if(X < Y){
                if(Y%X != 0) {
                    System.out.println(Y / X);
                }
                else{
                    System.out.println(Y/X-1);
                }
            }
            else{
                System.out.println("0");
            }
        }
        sc.close();
    }
}
