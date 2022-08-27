package JavaProgramming2022;

import java.util.Scanner;

public class The_Last_Levels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt();
            int Y = sc.nextInt(), Z = sc.nextInt();

            int ans = X*Y;
            if(X%3 == 0){
                ans += (X/3-1)*Z;
            }
            else{
                ans += (X/3)*Z;
            }


            System.out.println(ans);
        }
        sc.close();
    }
}
