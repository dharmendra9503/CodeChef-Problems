package JavaProgramming2022;

import java.util.Scanner;

public class Volume_Control {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt();
            if(X > Y){
                System.out.println(X-Y);
            }
            else if(Y > X){
                System.out.println(Y-X);
            }
            else{
                System.out.println("0");
            }
        }
        sc.close();
    }
}
