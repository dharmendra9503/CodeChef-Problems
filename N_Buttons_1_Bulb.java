package JavaProgramming2022;

import java.util.Scanner;

public class N_Buttons_1_Bulb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            String S = sc.next(), R = sc.next();

            int initial = 1;
            for(int i=0;i<N;i++){
                if(S.charAt(i) != R.charAt(i)){
                    if(initial == 1){
                        initial = 0;
                    }
                    else{
                        initial = 1;
                    }
                }
            }
            System.out.println(initial);
        }
        sc.close();
    }
}
