package JavaProgramming2022;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int discount = sc.nextInt();
            System.out.println(100-discount);
        }
        sc.close();
    }
}
