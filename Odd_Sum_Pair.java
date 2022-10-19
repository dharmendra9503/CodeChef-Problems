package JavaProgramming2022;

import java.util.Scanner;

public class Odd_Sum_Pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();

            if(((A+B)%2 != 0) || ((B+C)%2 != 0) || ((A+C)%2 != 0)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
