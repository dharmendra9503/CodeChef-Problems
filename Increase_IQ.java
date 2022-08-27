package JavaProgramming2022;

import java.util.Scanner;

public class Increase_IQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        if(X+7 > 170){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
