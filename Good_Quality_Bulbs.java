package JavaProgramming2022;

import java.util.Scanner;

public class Good_Quality_Bulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T=  sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), X = sc.nextInt();
            int[] arr = new int[N-1];
            int sum = 0;
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            if(((N*X)-sum)>0){
                System.out.println((N*X)-sum);
            }else{
                System.out.println(0);
            }
        }
        sc.close();
    }
}
