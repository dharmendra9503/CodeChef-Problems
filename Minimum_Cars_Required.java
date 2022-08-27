package JavaProgramming2022;

import java.util.Scanner;

public class Minimum_Cars_Required {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        double N;
        while(T-- > 0){
            N = sc.nextInt();
            if(N < 4){
                System.out.println("1");
            }
            else{
                int ans = (int)Math.ceil(N/4);
                System.out.println(ans);
            }
        }

        sc.close();
    }
}
