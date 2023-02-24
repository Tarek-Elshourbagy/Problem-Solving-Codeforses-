package Problem_Solving;

import java.util.Scanner;

public class Bear_and_BigBrother_prob13 {
    // we have two brothers, the req two make the first one's weight is more then the sec one
    // we should cal the no of years to make this rew case
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limak's weight");
        int Limak_weight = sc.nextInt();  //4
        System.out.println("Enter Bob's weight");
        int Bob_weight = sc.nextInt();    //7
        int years = 0;
        while (Limak_weight <= Bob_weight){
            Limak_weight = Limak_weight * 3; //36
            Bob_weight = Bob_weight * 2;  //28
            years = years + 1;
        }
        // the outputs 
        System.out.println("no of years =  " + years); // 2 years
        System.out.println("limak's after "+ years +" =  "+ Limak_weight);  //36
        System.out.println("limak's after "+ years +" =  "+ Bob_weight);    //28

    }
}
