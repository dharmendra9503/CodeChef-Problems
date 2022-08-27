package JavaProgramming2022;

import java.util.Scanner;

public class Self_Defence_Training {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int cnt = 0;
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
                if(arr[i]>=10 && arr[i]<=60){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
