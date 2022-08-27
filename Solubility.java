package JavaProgramming2022;

import java.util.Scanner;

public class Solubility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt();
            int A = sc.nextInt(), B = sc.nextInt();

            int pre = A+(100-X)*B;
            System.out.println(pre*10);
        }
        sc.close();
    }
}
