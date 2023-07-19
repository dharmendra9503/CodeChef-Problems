package JavaProgramming2022;

import java.util.Arrays;
import java.util.Scanner;

public class Card_Swipe {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            int[] a = new int[N+1];
            Arrays.fill(a, 0);
            int present = Integer.MIN_VALUE;
            int temp = 0;
            for(int i=0;i<N;i++) {
                arr[i] = sc.nextInt();
                if(a[arr[i]] == 1){
                    a[arr[i]] = 0;
                    temp--;
                }
                else{
                    a[arr[i]] = 1;
                    temp++;
                    present = Math.max(present, temp);
                }
            }
            System.out.println(present);
        }
        sc.close();
    }
}
