package JavaProgramming2022;

import java.util.Scanner;

public class Messi_vs_Ronaldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), B = sc.nextInt();
        int X = sc.nextInt(), Y = sc.nextInt();

        int mes = A*2 + B;
        int ron = X*2 + Y;

        if(ron > mes){
            System.out.println("Ronaldo");
        }
        else if(ron < mes){
            System.out.println("Messi");
        }
        else{
            System.out.println("Equal");
        }
        sc.close();
    }
}
