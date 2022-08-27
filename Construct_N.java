package JavaProgramming2022;

import java.util.Scanner;

public class Construct_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();

//            while(N >= 7){
//                N = N-7;
//            }
//
//            while(N >= 2){
//                N = N-2;
//            }

            if(N >= 7){
                N = N%7;
            }

            if(N >= 2){
                N = N%2;
            }

            if(N == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
