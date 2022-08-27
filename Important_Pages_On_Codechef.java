package JavaProgramming2022;

import java.util.Scanner;

public class Important_Pages_On_Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A == 1 && B == 1){
            System.out.println("https://discuss.codechef.com");
        }
        else if(A == 1 && B == 0){
            System.out.println("https://www.codechef.com/contests");
        }
        else if(A == 0 && B == 1){
            System.out.println("https://www.codechef.com/practice");
        }
        else{
            System.out.println("https://www.codechef.com/practice");
        }
        sc.close();
    }
}
