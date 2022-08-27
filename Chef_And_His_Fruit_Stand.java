package JavaProgramming2022;

import java.util.Scanner;

public class Chef_And_His_Fruit_Stand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt();
            int ba = X/2;
            System.out.println(Math.min(ba, Y));
        }
        sc.close();
    }
}
