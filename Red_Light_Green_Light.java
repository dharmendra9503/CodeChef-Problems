package JavaProgramming2022;

import java.util.Scanner;

public class Red_Light_Green_Light {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), K = sc.nextInt();
            int count = 0;
            for(int i=0;i<N;i++){
                int bet = sc.nextInt();
                if(bet > K){
                    count++;
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}
