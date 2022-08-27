package JavaProgramming2022;

import java.util.Scanner;

public class Chef_In_His_Office {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt();

            System.out.println(X*4 + Y);
        }

        sc.close();
    }
}
