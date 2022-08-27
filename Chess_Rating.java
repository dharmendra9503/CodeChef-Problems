package JavaProgramming2022;

import java.util.Scanner;

public class Chess_Rating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt();

            int mod = (Y-X)%8;
            int remain = (Y-X)/8;
            if(mod == 0){
                System.out.println(remain);
            }
            else{
                System.out.println(remain+1);
            }
        }
        sc.close();
    }
}
