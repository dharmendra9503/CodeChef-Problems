package JavaProgramming2022;

import java.util.Scanner;

public class Sugarcane_Juice_Business {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int income = 50*N;
            int profit = (2*(20*income/100) + (30*income)/100);
            profit = income - profit;
            System.out.println(profit);
        }
        sc.close();
    }
}
