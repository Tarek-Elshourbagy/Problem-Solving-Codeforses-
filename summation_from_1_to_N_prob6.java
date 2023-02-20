package Problem_Solving;

import java.util.Scanner;

public class summation_from_1_to_N_prob6 {
    // used to calc the summation for the numbers from 1 to the input nnumber
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the number");
        // for the time limits we change from int to long
        long number = sc.nextLong();
        // we use the summation rule
        // sum = (n*(n+1))/2
        long sum = (number*(number+1))/2;
        System.out.print("the summation number  " + sum);
    }
}
//            _another way to solve_
//        for (int i = 1 ; i <= number; i++){
//            sum = sum + i;
//        }
