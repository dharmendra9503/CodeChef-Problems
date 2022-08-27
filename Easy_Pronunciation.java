package JavaProgramming2022;

import java.util.Scanner;

public class Easy_Pronunciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            String S = sc.next();

            int cons = 0;
            int conCons = 0;
            for(int i=0;i<N;i++){
                char ch = S.charAt(i);
                if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                    cons++;
                }
                else{
                    conCons = Math.max(conCons, cons);
                    cons = 0;
                }
            }

            conCons = Math.max(conCons, cons);
            if(conCons >= 4){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
