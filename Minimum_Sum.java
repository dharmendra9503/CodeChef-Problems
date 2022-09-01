package JavaProgramming2022;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Sum {

    private static long gcd(long a, long b){
        return b == 0 ? a : gcd(b, a%b);
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            long[] array = new long[N];

            for(int i=0;i<N;i++) {
                array[i] = sc.nextInt();
            }

            long ele = array[0];
            for(int i=1;i<N;i++){
                ele = gcd(ele, array[i]);
            }
            System.out.println(ele*N);
        }
        sc.close();
    }
}
