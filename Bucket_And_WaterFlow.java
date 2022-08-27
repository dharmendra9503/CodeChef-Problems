package JavaProgramming2022;

import java.util.Scanner;

public class Bucket_And_WaterFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int W = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt();
            if(X < (W+Y*Z)){
                System.out.println("overflow");
            }
            else if(X == (W+Y*Z)){
                System.out.println("filled");
            }
            else{
                System.out.println("unfilled");
            }
        }
        sc.close();
    }
}
