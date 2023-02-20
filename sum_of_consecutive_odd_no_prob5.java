package Problem_Solving;

import java.util.Scanner;
public class sum_of_consecutive_odd_no_prob5 {
    // take no of lines from user plus two numbers in each line
    // to get the sum of the odd numbers in between
    // input = 4,10 ,output =  5+7+9=21
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of lines ");
        int lines = sc.nextInt();
        for(int j = 0 ; j <= lines ; j++) {
            System.out.println("Enter the first number");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number");
            int num2 = sc.nextInt();
            // to make sure that the first number
            // whose put in if will be the smallest one
            // and the second one will be the largest one
            int min = Math.min(num1,num2);
            int max = Math.max(num1,num2);
            int sum = 0;
            for (int i = min + 1; i < max; i++) {
                if (i % 2 != 0) {
                    sum = sum + i;
                    continue;
                }
            }
            System.out.println(sum);
        }
    }
}
