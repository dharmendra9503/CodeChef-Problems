package JavaProgramming2022;

import java.util.Scanner;

public class Bear_And_Candies_123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt(), B = sc.nextInt();
            for(int i=1;i<5000;i++){
                if(i%2 ==1){
                    A = A-i;
                    if(A<0){
                        System.out.println("Bob");
                        break;
                    }
                }
                else{
                    B = B-i;
                    if (B < 0) {
                        System.out.println("Limak");
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}
