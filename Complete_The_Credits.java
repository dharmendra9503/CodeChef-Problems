package JavaProgramming2022;

import java.util.Scanner;

public class Complete_The_Credits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt();
            if(X>65){
                System.out.println("Overload");
            }
            else if(X<35){
                System.out.println("Underload");
            }
            else{
                System.out.println("Normal");
            }
        }
        sc.close();
    }
}
