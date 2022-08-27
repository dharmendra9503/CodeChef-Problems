package JavaProgramming2022;

import java.util.Scanner;

public class High_Accuracy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt();

            int i=0;
            while(i*3 < X){
                i++;
            }
            if(i*3 == X){
                System.out.println("0");
            }
            else if(i*3 > X){
                System.out.println((i*3)-X);
            }
        }
        sc.close();
    }
}
