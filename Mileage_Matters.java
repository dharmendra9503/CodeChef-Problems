package JavaProgramming2022;

import java.util.Scanner;

public class Mileage_Matters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            float km = sc.nextInt();
            float pCost = sc.nextInt(), dCost = sc.nextInt();   //Petrol cost and Diesel cost
            float twp = sc.nextInt(), twd = sc.nextInt();    //travel with petrol and travel with diesel

            float costWithPetrol = ((km/twp)*pCost);
            float costWithDiesel = ((km/twd)*dCost);

            if(costWithPetrol > costWithDiesel){
                System.out.println("DIESEL");
            }
            else if(costWithPetrol < costWithDiesel){
                System.out.println("PETROL");
            }
            else{
                System.out.println("ANY");
            }
        }
        sc.close();
    }
}
