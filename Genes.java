package JavaProgramming2022;

import java.util.Scanner;

public class Genes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.next();
        String sec = sc.next();

        if(first.equals("R") || sec.equals("R")){  //R --> Brown
            System.out.println("R");
        }
        else if(first.equals("B") || sec.equals("B")){
            System.out.println("B");
        }
        else{
            System.out.println("G");
        }
        sc.close();
    }
}
