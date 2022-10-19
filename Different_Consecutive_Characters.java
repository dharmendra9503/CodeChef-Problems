package JavaProgramming2022;

import java.util.Scanner;

public class Different_Consecutive_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            String S = sc.next();

            int cnt = 0;
            for(int i=0;i<N-1;i++){
                if(S.charAt(i) == S.charAt(i+1)){
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
        sc.close();
    }
}
