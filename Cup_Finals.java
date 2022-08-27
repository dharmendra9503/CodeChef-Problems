package JavaProgramming2022;

import java.util.Scanner;

public class Cup_Finals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T=  sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt();
            int D = sc.nextInt();

            if(Math.abs(X-Y)<=D){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
