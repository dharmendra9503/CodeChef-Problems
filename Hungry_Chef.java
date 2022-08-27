package JavaProgramming2022;

import java.util.Scanner;

public class Hungry_Chef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt();
            int N = sc.nextInt(), R = sc.nextInt();

            if(R/Y >= N){
                System.out.println(0+" "+N);
            }
            else if(R/X < N){
                System.out.println("-1");
            }
            else{
                int temp1 = Y*N;
                int temp2 = X-Y;

                int m = (R-temp1)/temp2;
                if((R-temp1)%temp2 != 0){
                    m++;
                }

                System.out.println(m+" "+(N-m));
            }
        }
        sc.close();
    }
}
