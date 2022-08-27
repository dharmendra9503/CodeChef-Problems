package JavaProgramming2022;

import java.util.Scanner;

public class Chef_Drinks_Tea {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt();

            int d = X/Y;
            if(X%Y == 0){
                System.out.println(Z*d);
            }
            else{
                System.out.println(Z*(d+1));
            }
        }
        sc.close();
    }
}
