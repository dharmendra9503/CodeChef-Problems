package JavaProgramming2022;

import java.util.Scanner;

public class Odd_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){

            int N = sc.nextInt();
            if(N%2 == 0){
                System.out.println(N*N/2);
            }
            else if(N%2 != 0){
                System.out.println((N*N-1)/2);
            }
            else{
                System.out.println("0");
            }

            //This will give TLE
//            int cnt = 0;
//            for(int i=1;i<=N;i++){
//                for(int j=1;j<=N;j++){
//                    if((i+j)%2 != 0){
//                        cnt++;
//                    }
//                }
//            }
//            System.out.println(cnt);


        }
        sc.close();
    }
}
