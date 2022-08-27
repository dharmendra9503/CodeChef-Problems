package JavaProgramming2022;
import java.util.*;

class Solution{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int ca = 1;
        while(T-- > 0){
            String kingdom = sc.next();
            int length = kingdom.length();

            char r = kingdom.charAt(length-1);
            if(r == 'y' || r == 'Y'){
                System.out.println("Case #"+ca+": "+kingdom+" is ruled by nobody.");
            }
            else if(r == 'A' || r == 'a' || r == 'E' || r == 'e' || r == 'O' || r == 'o' || r == 'U' || r == 'u' || r == 'I' || r == 'i'){
                System.out.println("Case #"+ca+": "+kingdom+" is ruled by Alice.");
            }
            else{
                System.out.println("Case #"+ca+": "+kingdom+" is ruled by Bob.");
            }

            ca++;
        }
        sc.close();
    }
}