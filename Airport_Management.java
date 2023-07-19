package JavaProgramming2022;

import java.util.Scanner;

public class Airport_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] d = new int[n];
            int[] freq = new int[1440];

            for (int i=0; i<n; i++){
                a[i] = sc.nextInt();
                freq[a[i]]++;
            }

            for (int i=0; i<n; i++){
                d[i] = sc.nextInt();
                freq[d[i]]++;
            }

            int count=0;
            for (int i=0; i<1440; i++){
                count = Math.max(count, freq[i]);
            }

            System.out.println(count);
        }
        sc.close();
    }
}
