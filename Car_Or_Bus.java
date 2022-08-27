package JavaProgramming2022;

import java.util.Scanner;

public class Car_Or_Bus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt();

            if(X > Y){
                System.out.println("CAR");
            }
            else if(X < Y){
                System.out.println("BIKE");
            }
            else{
                System.out.println("SAME");
            }
        }
        sc.close();
    }
}
