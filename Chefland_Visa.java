package JavaProgramming2022;

import java.util.Scanner;

public class Chefland_Visa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int x1 =sc.nextInt(), x2 = sc.nextInt();
            int y1 =sc.nextInt(), y2 = sc.nextInt();
            int z1 =sc.nextInt(), z2 = sc.nextInt();

            if(x1<=x2 && y1<=y2 && z1>=z2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
