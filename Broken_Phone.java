package JavaProgramming2022;

import java.util.Scanner;

public class Broken_Phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(X > Y){
                System.out.println("NEW PHONE");
            }
            else if(X < Y){
                System.out.println("REPAIR");
            }
            else {
                System.out.println("ANY");
            }
        }
        sc.close();
    }
}
