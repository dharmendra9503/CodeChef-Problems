package JavaProgramming2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WA_Test_Cases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int[] S = new int[N];
            for(int i=0;i<N;i++){
                S[i] = sc.nextInt();
            }
            String V = sc.next();

            List<Integer> failed = new ArrayList<>();

            for(int i=0;i<N;i++){
                if(V.charAt(i) == '0'){
                    failed.add(S[i]);
                }
            }

            Collections.sort(failed);

            System.out.println(failed.get(0));
        }
        sc.close();
    }
}
