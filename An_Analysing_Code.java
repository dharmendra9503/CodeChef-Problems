package JavaProgramming2022;

import java.util.Scanner;

public class An_Analysing_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        if(C <= 1000){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
