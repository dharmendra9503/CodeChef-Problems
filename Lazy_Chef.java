package JavaProgramming2022;

import java.util.Scanner;

public class Lazy_Chef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int x = sc.nextInt(), m = sc.nextInt(), d = sc.nextInt();
            int a = m*x;
            int li = x+d;
            System.out.println(Math.min(a, li));
        }
        sc.close();
    }
}
