package JavaProgramming2022;

import java.util.Scanner;

public class To_Divide_Or_Not_To_Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            long A = sc.nextInt(), B = sc.nextInt();
            long N = sc.nextInt();

            if(A%B == 0){
                System.out.println("-1");
            }
            else{
                if(N%A != 0){
                    N = N+A - (N%A);
                }
                while(!(N%A == 0 && N%B != 0)){
                    N += A;
                }

                System.out.println(N);
            }
        }
        sc.close();
    }
}
