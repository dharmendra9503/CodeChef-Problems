package JavaProgramming2022;

import java.util.Scanner;

public class Chef_And_Races {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt();
            int A = sc.nextInt(), B = sc.nextInt();

            int count=0;
            if((X!=A && X!=B)&&(Y!=A && Y!=B))
                count=2;
            else if((X!=A && X!=B)||(Y!=A && Y!=B))
                count=1;
            System.out.println(count);
        }
        sc.close();
    }
}
