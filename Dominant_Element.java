package JavaProgramming2022;

import java.util.*;

public class Dominant_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int[] A = new int[N];
//            List<Integer> A = new ArrayList<>();
            for(int i=0;i<N;i++){
                A[i] = sc.nextInt();
            }

            Map<Integer, Integer> dominant = new TreeMap<>();

            for(int j=0;j<N;j++){
                dominant.put(A[j],dominant.getOrDefault(A[j],0)+1);
            }

            int max1=0;
            int max2=0;
            boolean flag = true;
            if(dominant.size() == 1)
            {
                System.out.println("YES");
                flag = false;
            }
            for(Map.Entry<Integer,Integer> val : dominant.entrySet()){
                int res = val.getValue();
                if(res>max1){
                    max2=max1;
                    max1=res;
                }else if(res>max2){
                    max2=res;
                }
            }

            if(flag){
                if(max1>max2){
                    System.out.println("YES");
                }    else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
