package JavaProgramming2022;

import java.util.Scanner;

public class Too_Many_Times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            if(N%10 == 0){
                System.out.println(N/10);
            }
            else{
                System.out.println(N/10+1);
            }
        }
        sc.close();
    }
}
