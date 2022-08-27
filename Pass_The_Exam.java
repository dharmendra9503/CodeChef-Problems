package JavaProgramming2022;

import java.util.Scanner;

public class Pass_The_Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
            int total = A+B+C;

            if(A >= 10 && B >= 10 && C >= 10 && total >= 100){
                System.out.println("PASS");
            }
            else{
                System.out.println("FAIL");
            }
        }
        sc.close();
    }
}
