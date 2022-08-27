package JavaProgramming2022;

import java.util.Scanner;

public class Penalty_Shots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int[] A = new int[11];
            for(int i=1;i<=10;i++){
                A[i] = sc.nextInt();
            }

        //    team-1  --> odd     team-2 --> Even
            int s1 = 0, s2 = 0;
            for(int i=1;i<=10;i++){
                if(i%2 != 0){
                    if(A[i] == 1){
                        s1++;
                    }
                }
                else{
                    if(A[i] == 1){
                        s2++;
                    }
                }
            }

            System.out.println(s1);
            System.out.println(s2);
            if(s1 > s2){
                System.out.println("1");
            }
            else if (s1 < s2){
                System.out.println("2");
            }
            else{
                System.out.println("0");
            }

        }
        sc.close();
    }
}
