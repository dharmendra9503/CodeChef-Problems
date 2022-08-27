package JavaProgramming2022;

import java.util.Scanner;

public class Enough_Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if(N >= X+(2*Y)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
