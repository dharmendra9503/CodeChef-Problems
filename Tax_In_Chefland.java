package JavaProgramming2022;

import java.util.Scanner;

public class Tax_In_Chefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt();
            if(X > 100){
                X -= 10;
            }

            System.out.println(X);
        }
        sc.close();
    }
}
