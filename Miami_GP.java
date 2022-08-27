package JavaProgramming2022;

import java.util.Scanner;

public class Miami_GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt();
            if((X*107/100)<Y){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
