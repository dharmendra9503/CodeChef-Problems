package JavaProgramming2022;

import java.util.Scanner;

public class FIND_A_and_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt();

            if((X*Y)%Z == 0) {
                System.out.println(X*Y+" "+Z);
            }
            else if((Y*Z)%X == 0) {
                System.out.println(Y*Z+" "+X);
            }
            else if((X*Z)%Y == 0) {
                System.out.println(X*Z+" "+Y);
            }
            else{
                System.out.println("-1");
            }

        }
        sc.close();
    }
}
