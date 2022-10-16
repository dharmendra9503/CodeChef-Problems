package JavaProgramming2022;

import java.util.Scanner;

public class Paper_Cutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), K = sc.nextInt();

            if(N == K) {
                System.out.println("1");
            }
            else if(K == 1){
                System.out.println(N);
            }
            else{
                System.out.println((N/K) * (N/K));
            }
        }
        sc.close();
    }
}
