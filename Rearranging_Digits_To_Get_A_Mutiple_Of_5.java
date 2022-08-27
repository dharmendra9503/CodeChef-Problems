package JavaProgramming2022;

import java.util.Scanner;

public class Rearranging_Digits_To_Get_A_Mutiple_Of_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int D;
        String N;
        while(T-- > 0){
            D = sc.nextInt();
            N = sc.next();
            if(D == N.length()){
                int cnt = 0;
                for(int i=0;i<D;i++){
                    if(N.charAt(i) == '0' || N.charAt(i) == '5'){
                        cnt++;
                    }
                }

                if(cnt > 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
