package JavaProgramming2022;

import java.util.Scanner;

public class Valid_Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int ans1 = sc.nextInt(), ans2 = sc.nextInt(), ans3 = sc.nextInt();

            if((ans1 == ans2 && ans1 <= ans3) || (ans1 == ans3 && ans1 <= ans2) || (ans3 == ans2 && ans2 <= ans1)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
