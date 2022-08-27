package JavaProgramming2022;

import java.util.Scanner;

public class Good_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();

            if(N%4 == 0){
                System.out.println("GOOD");
            }
            else{
                System.out.println("NOT GOOD");
            }
        }
        sc.close();
    }
}
