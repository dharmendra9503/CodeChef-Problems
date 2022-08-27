package JavaProgramming2022;

import java.util.Scanner;

public class Football_Cup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt();
            if(X == Y && X>0 && Y>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
