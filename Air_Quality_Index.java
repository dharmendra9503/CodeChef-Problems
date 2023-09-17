package JavaProgramming2022;

import java.util.Scanner;

public class Air_Quality_Index {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int AQ = sc.nextInt();
        if(AQ < 100) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        sc.close();
    }
}
