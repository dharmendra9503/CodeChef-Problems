package JavaProgramming2022;

import java.util.Scanner;

public class Hungry_Ashish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt();

            if(X >= Z){
                System.out.println("BURGER");
            }
            else if(X >= Y){
                System.out.println("PIZZA");
            }
            else{
                System.out.println("NOTHING");
            }
        }
        sc.close();
    }
}
