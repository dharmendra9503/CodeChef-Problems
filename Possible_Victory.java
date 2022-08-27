package JavaProgramming2022;

import java.util.Scanner;

public class Possible_Victory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt(), O = sc.nextInt(), C = sc.nextInt();
        int over = 20-O;
        if((C+(over*6*6)) >= R+1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
