package JavaProgramming2022;

import java.util.Scanner;

public class Chef_On_Island {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int x = sc.nextInt(), y = sc.nextInt();
            int xr = sc.nextInt(), yr = sc.nextInt();
            int D = sc.nextInt();

            if(x >= xr*D && y >= yr*D){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
