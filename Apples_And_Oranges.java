package JavaProgramming2022;

import java.util.Scanner;

public class Apples_And_Oranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int A = sc.nextInt(), B = sc.nextInt();

        if(X >= (A+B)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
