package JavaProgramming2022;

import java.util.HashSet;
import java.util.Scanner;

public class Equal_Distinct {private static String match(int[] arr){
    int n = arr.length;
    HashSet<Integer> set = new HashSet<>();
    for(int i=0;i<arr.length;i++){
        set.add(arr[i]);
    }

    if(n==2){
        return "YES";
    }
    if(n == set.size() && n%2 == 0){
        return "YES";
    }
    if(set.size() < n){
        return "YES";
    }

    return "NO";
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }

            System.out.println(match(arr));
        }
        sc.close();
    }
}
