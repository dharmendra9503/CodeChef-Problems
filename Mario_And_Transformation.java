package JavaProgramming2022;

import java.util.Scanner;

public class Mario_And_Transformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt();
            int s = X%3;
            if(s == 1){
                System.out.println("HUGE");
            }
            else if(s == 2){
                System.out.println("SMALL");
            }
            else{
                System.out.println("NORMAL");
            }
        }
        sc.close();
    }
}
