package JavaProgramming2022;

import java.util.Scanner;

public class Elections_In_Chefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();

            if(A > 50){
                System.out.println("A");
            }
            else if(B > 50){
                System.out.println("B");
            }
            else if(C > 50){
                System.out.println("C");
            }
            else{
                System.out.println("NOTA");
            }
        }
        sc.close();
    }
}
