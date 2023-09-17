package JavaProgramming2022;

import java.util.Scanner;

public class Stamps_100 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int n= sc.nextInt();
            String str = sc.next();
            int firstOne=n;
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='1'){
                    firstOne=i;
                    break;
                }
            }
            if(firstOne < n-2){
                char [] charArray = str.toCharArray();
                for(int i=firstOne+1;i<n;i++){
                    charArray[i]='0';
                }
                System.out.println(String.valueOf(charArray));
            }else{
                System.out.println(str);
            }
        }
        sc.close();
    }
}
