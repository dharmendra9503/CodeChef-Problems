package JavaProgramming2022;

import java.util.Scanner;

public class Car_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int P = sc.nextInt(), M = sc.nextInt(), V = sc.nextInt();
            int economy = (M-(P-1))*V;
            System.out.println(economy);
        }
        sc.close();
    }
}
