package JavaProgramming2022;

import java.util.Scanner;

public class Chef_Diet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), K = sc.nextInt();
            int[] arr = new int[N];
            int sum= 0;
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }

            int cnt = 0;
            for(int i=0;i<arr.length;i++){
                sum += arr[i];
                if(sum >= K){
                    sum -= K;
                    cnt++;
                }
                else if(sum < K){
                    System.out.println("NO "+(cnt+1));
                    break;
                }
            }

            if(cnt == N){
                System.out.println("YES");
            }

        }
        sc.close();
    }
}
