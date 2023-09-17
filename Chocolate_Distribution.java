package JavaProgramming2022;

import java.util.Scanner;

public class Chocolate_Distribution {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            if(N%2 != 0) {
                int a = 1;
                int b = (N-1)/2;
                System.out.println(a+" "+b+" "+b);
            }
            else{
                int a = (N/4)+(N/4-1);
                int b = N-2*a;
                System.out.println(a+" "+a+" "+b);
            }
        }
        sc.close();
    }
}
