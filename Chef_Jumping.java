package JavaProgramming2022;

import java.util.Scanner;

public class Chef_Jumping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long a = sc.nextLong();
        if(a%6 == 0 || a%6 == 1 || a%6 == 3){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        sc.close();
    }
}
