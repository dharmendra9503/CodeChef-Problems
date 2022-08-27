package JavaProgramming2022;

import java.util.Scanner;

public class The_Old_Saint_And_Three_Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int a1 = sc.nextInt(), a2 = sc.nextInt(), a3 = sc.nextInt();
            int b1 = sc.nextInt(), b2 = sc.nextInt(), b3 = sc.nextInt();

            if((a1+a2+a3) == (b1+b2+b3)){
                System.out.println("Pass");
            }
            else{
                System.out.println("Fail");
            }
        }
        sc.close();
    }
}