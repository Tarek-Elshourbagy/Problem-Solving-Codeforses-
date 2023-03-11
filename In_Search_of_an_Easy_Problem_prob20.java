package Problem_Solving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class In_Search_of_an_Easy_Problem_prob20 {
//   Input
// The first line contains the number of people who were asked to give their opinions.
// The second line contains each integer is either 0 or 1, If 0, person thinks that the problem is easy;
// if it is 1, person thinks that the problem is hard.
//  Output
// Print "EASY" if the problem is easy according to all responses, or "HARD" if there is at least one person told it is hard.
// input                     input
// 3                         2
// 0 0 1                     0 0
// output                    output
// HARD                      EASY
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number of your opinions");
        int options = sc.nextInt();
        List<Integer> numbers= new ArrayList<Integer>();
        int count = 0;
        for(int opt = 0 ; opt < options ; opt++){
            System.out.println("please enter your opt no. = "+ (opt+1) +" if easy enter 0, if hard enter 1");
            int your_option = sc.nextInt();
            numbers.add(your_option);
            if (your_option == 1){
                count++;
            }
        }
        System.out.println(numbers);
        if (count >= 1){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
    }
}
