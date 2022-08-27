package JavaProgramming2022;

import java.util.Scanner;

public class Binary_Base_Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), K = sc.nextInt();
            String S = sc.next();
            int cnt = 0;

            for(int i=0, j=S.length()-1; i<j; i++,j--){
                if (S.charAt(i) != S.charAt(j)) {
                    cnt++;
                }
            }

            if(cnt <= K){
                if(S.length()%2 != 0){
                    System.out.println("YES");
                }
                else if((cnt - K)%2 == 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
