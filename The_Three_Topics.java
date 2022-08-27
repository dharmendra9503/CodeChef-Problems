package JavaProgramming2022;

import java.util.Scanner;

public class The_Three_Topics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
        int X = sc.nextInt();

        if(A == X || B == X || C == X){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
