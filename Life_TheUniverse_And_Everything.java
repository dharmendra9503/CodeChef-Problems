package JavaProgramming2022;

import java.util.Scanner;

public class Life_TheUniverse_And_Everything {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext())
        {
            int N=sc.nextInt();
            if(N!=42)
            {
                System.out.println(N);
            }
            else
            {
                break;
            }

        }
    }
}
