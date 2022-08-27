package JavaProgramming2022;

import java.util.Scanner;

public class It_Is_Hot_Or_Cold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int C = sc.nextInt();
            if(C > 20){
                System.out.println("HOT");
            }
            else{
                System.out.println("COLD");
            }
        }
        sc.close();
    }
}
