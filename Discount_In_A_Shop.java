package JavaProgramming2022;

import java.util.Scanner;

public class Discount_In_A_Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            String N = sc.next();
            int i=0;
            String ans = "";
            while(i <= N.length()-2){
                if(N.charAt(i) > N.charAt(i+1)){
                    break;
                }
                else{
                    ans = ans+N.charAt(i);
                }
                i+=1;
            }

            int j = i+1;
            while(j<=N.length()-1){
                ans = ans+N.charAt(j);
                j+=1;
            }

            System.out.println(Integer.parseInt(ans));
        }
        sc.close();
    }
}
