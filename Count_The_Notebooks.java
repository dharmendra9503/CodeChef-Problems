package JavaProgramming2022;

import java.util.Scanner;

public class Count_The_Notebooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int kg = sc.nextInt();
            int pages = kg*1000;
            int notes = pages/100;

            System.out.println(notes);
        }
        sc.close();
    }
}
