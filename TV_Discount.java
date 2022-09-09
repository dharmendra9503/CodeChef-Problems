package JavaProgramming2022;

import java.util.Scanner;

public class TV_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt(), B = sc.nextInt();
            int C = sc.nextInt(), D = sc.nextInt();

            if(A-C < B-D){
                System.out.println("First");
            }
            else if(A-C > B-D){
                System.out.println("Second");
            }
            else{
                System.out.println("Any");
            }
        }
        sc.close();
    }
}
