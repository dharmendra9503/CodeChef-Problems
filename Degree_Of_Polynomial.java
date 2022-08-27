package JavaProgramming2022;

import java.util.Scanner;

public class Degree_Of_Polynomial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();    //Total Number Of Terms
            int[] arr = new int[N];
            int degree = 0;
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
                if(arr[i] != 0){
                    degree = i;
                }
            }
            System.out.println(degree);
        }
        sc.close();
    }
}
