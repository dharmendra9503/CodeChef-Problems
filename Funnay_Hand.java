package JavaProgramming2022;

import java.util.Scanner;

public class Funnay_Hand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-- > 0){
            int N = sc.nextInt();
            int A = sc.nextInt(), B = sc.nextInt();

//            MY LOGIC
//            if(A == B){
//                System.out.println("0");
//            }
//            else if(Math.abs(A-B) == 1){
//                double cnt = 0;
//                for(int i=1;i<=N;i++){
//                    if(i != A && i != B && ((Math.abs(A-i) == 1) || (Math.abs(B-i) == 1))){
//                        cnt++;
//                    }
//                }
//                double inter = cnt/N;
//                System.out.println((int)(inter*N));
//            }
//            else{
//                System.out.println("0");
//            }

            //ANOTHER LOGIC
            int min = Math.min(A, B);
            int max = Math.max(A, B);

            if (min == 1 && Math.abs(A - B) == 1) {
                System.out.println("1");
            }
            else if(min != 1 && max != N && Math.abs(A-B) == 1){
                System.out.println("2");
            }
            else if(Math.abs(A-B) == 1 && max == N){
                System.out.println("1");
            }
            else if(Math.abs(A-B) == 2){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
        sc.close();
    }
}
