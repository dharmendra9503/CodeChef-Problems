package JavaProgramming2022;

import java.util.Scanner;

public class Average_Of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt();

            int i=0,j=1,k=2;
            while(true){
                if(((i+j+k)/3) == X){
                    System.out.println(i+" "+j+" "+k);
                    break;
                }
                i++;j++;k++;
            }
        }
        sc.close();
    }
}
