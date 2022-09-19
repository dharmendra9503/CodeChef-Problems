package JavaProgramming2022;

import java.util.Scanner;

public class Nearest_Exit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt();

            if(X > 100/2){
                System.out.println("RIGHT");
            }
            else{
                System.out.println("LEFT");
            }
        }
        sc.close();
    }
}
