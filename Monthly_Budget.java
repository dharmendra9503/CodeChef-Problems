package JavaProgramming2022;

import java.util.Scanner;

public class Monthly_Budget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt();

            if((Y*30) <= X){
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
