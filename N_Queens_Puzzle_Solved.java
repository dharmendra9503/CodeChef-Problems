package JavaProgramming2022;

import java.util.Scanner;

public class N_Queens_Puzzle_Solved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            float n = (float)0.143*N;

            float mul = n;
            for(int i=2;i<=N;i++){
                mul = mul*n;
            }

            if(mul - Math.floor(mul) < 0.5){
                System.out.println((int)Math.floor(mul));
            }
            else{
                System.out.println((int)Math.ceil(mul));
            }
        }
        sc.close();
    }
}
