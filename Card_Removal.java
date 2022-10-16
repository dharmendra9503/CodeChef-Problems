package JavaProgramming2022;

import java.util.*;

public class Card_Removal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int[] A = new int[N];
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i=0;i<N;i++){
                A[i] = sc.nextInt();
                if(map.containsKey(A[i])){
                    Integer cnt = map.get(A[i]) + 1;
                    map.put(A[i], cnt);
                }
                else{
                    map.put(A[i], 1);
                }
            }

            ArrayList<Integer> list = new ArrayList<>();
            for(Map.Entry<Integer, Integer> val : map.entrySet()){
                list.add(val.getValue());
            }
            Collections.sort(list);

            int ans = 0;
            int i=0;
            while(i < list.size()-1){
                ans += list.get(i);
                i++;
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
