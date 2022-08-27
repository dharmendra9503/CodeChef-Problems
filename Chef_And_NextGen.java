package JavaProgramming2022;

import java.util.Scanner;

public class Chef_And_NextGen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt(), B = sc.nextInt();
            int X = sc.nextInt(), Y = sc.nextInt();

            if(A*B <= X*Y){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
