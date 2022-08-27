package JavaProgramming2022;

import java.util.Scanner;

public class Roller_Coaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt();
            int H = sc.nextInt();
            if(X >= H){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
