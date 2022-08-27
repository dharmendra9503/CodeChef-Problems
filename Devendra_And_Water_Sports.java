package JavaProgramming2022;

import java.util.Scanner;

public class Devendra_And_Water_Sports {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int Z = sc.nextInt(), Y = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
            if((A+B+C) <= (Z-Y)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
