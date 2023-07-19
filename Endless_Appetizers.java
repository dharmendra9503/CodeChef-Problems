package JavaProgramming2022;

import java.util.Scanner;

public class Endless_Appetizers {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt(), R = sc.nextInt();
            int extra = R/30;
            int totalStick = X + extra;
            int totalPlate = 0;
            if(totalStick%Y == 0)
                totalPlate = totalStick/Y;
            else
                totalPlate = totalStick/Y + 1;
            System.out.println(totalPlate);
        }
        sc.close();
    }
}
