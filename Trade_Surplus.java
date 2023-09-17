package JavaProgramming2022;

import java.util.Scanner;

public class Trade_Surplus {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A1 = sc.nextInt(), A2 = sc.nextInt(), B1 = sc.nextInt(), B2 = sc.nextInt();
            int f = A1-A2;
            int r = B1-B2;
            int mid = f+r;
            if(mid < 0) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
