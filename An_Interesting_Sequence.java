package JavaProgramming2022;

import java.util.ArrayList;
import java.util.Scanner;

public class An_Interesting_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int K = sc.nextInt();
            int temp = K;
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> addi = new ArrayList<>();
            temp = temp/2;
            while(temp != 0){
                list.add(temp);
                temp = temp/2;
            }

            int sum = 0;
            for(int i=0;i<list.size();i++){
                sum += list.get(i);
                addi.add(sum);
            }

            int cnt = 0;
            for(int i=0;i<list.size();i++){
                if((list.get(i)+addi.get(i)) == K){
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
        sc.close();
    }
}
