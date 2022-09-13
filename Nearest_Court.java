package JavaProgramming2022;

import java.util.Scanner;

public class Nearest_Court {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* We try to place the meeting point at the mid point.
        We need to be careful about the case where the distance between them isn’t even.
        So we take the ceiling. */

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt();
            int Z = (int)Math.ceil((Math.max(X,Y) - Math.min(X,Y))/2.0);
            System.out.println(Z);
        }
        sc.close();
    }
}
