package JavaProgramming2022;

import java.util.Scanner;

public class Minimum_Number_Of_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt();
            int cnt = 0;
            if(X%5 == 0) {
                while (X % 5 == 0 && X>0) {
                    if(X >= 10){
                        X = X-10;
                    }
                    else{
                        X = X-5;
                    }
                    cnt++;
                }

                System.out.println(cnt);
            }
            else{
                System.out.println("-1");
            }
        }
        sc.close();
    }
}
