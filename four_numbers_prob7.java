package Problem_Solving;

import java.util.Scanner;

public class four_numbers_prob7 {
    // input = 1*2*3*4
    // output = 24
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the four numbers");
        int first_NO = sc.nextInt();
        int second_NO = sc.nextInt();
        int third_NO = sc.nextInt();
        int forth_NO = sc.nextInt();
        // we used long in the result to insure for the limitation of the variables
        long result = (long) first_NO * second_NO * third_NO * forth_NO;
        System.out.println("the result is =  " + result);

    }
}
