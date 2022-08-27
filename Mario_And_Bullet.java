package JavaProgramming2022;

import java.util.Scanner;

public class Mario_And_Bullet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt();
            int r = Y/X;
            if(r<Z){
                System.out.println(Z - r);
            }
            else {
                System.out.println("0");
            }
        }
        sc.close();
    }
}
