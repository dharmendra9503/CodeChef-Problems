package JavaProgramming2022;

import java.util.Scanner;

public class Get_Lowest_Free {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt(), B = sc.nextInt(), C=  sc.nextInt();
            if(A<=C && A<=B){
                System.out.println(B+C);
            }
            else if(B<=C && B<=A){
                System.out.println(A+C);
            }
            else{
                System.out.println(A+B);
            }
        }
        sc.close();
    }
}
