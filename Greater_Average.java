package JavaProgramming2022;

import java.util.Scanner;

public class Greater_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0) {
            int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
            float avg = (float) (A + B) / 2;

            if(avg > C){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
