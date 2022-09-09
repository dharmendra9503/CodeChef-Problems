package JavaProgramming2022;

import java.util.*;

public class Permutation_Clear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            List<Integer> A = new ArrayList<>(N);
            int J = N;
            while(J-- > 0){
                A.add(sc.nextInt());
            }

            int K = sc.nextInt();
            Set<Integer> B = new HashSet<>();
            while(K-- > 0){
                int x = sc.nextInt();
                B.add(x);
            }

            for(int i=0;i<N;i++){
                if(!B.contains(A.get(i))){
                    System.out.print(A.get(i)+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
