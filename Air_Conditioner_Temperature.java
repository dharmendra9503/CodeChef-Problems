package JavaProgramming2022;

import java.util.Scanner;

public class Air_Conditioner_Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            //alice want at least A degree
            //bob wants at most B degree
            //charlie want at least C degree

            int alice = sc.nextInt(), bob = sc.nextInt(), charlie = sc.nextInt();
            if(alice <= bob && charlie <= bob){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
