package JavaProgramming2022;

import java.util.Scanner;

public class Kitchen_Timetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for(int i=0;i<A.length;i++){
                A[i] = sc.nextInt();
            }
            for(int i=0;i<B.length;i++){
                B[i] = sc.nextInt();
            }

            int cnt = 0;
            for(int i=0;i<A.length;i++){
                if(i==0){
                    if(A[i] >= B[i]){
                        cnt++;
                    }
                }
                else{
                    int temp = A[i]-A[i-1];
                    if(temp>=B[i]){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
