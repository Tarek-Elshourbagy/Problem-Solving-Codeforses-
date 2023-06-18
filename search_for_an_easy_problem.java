package Problem_Solving;
import java.util.Scanner;

public class search_for_an_easy_problem {
/*
Input
        The first line contains a single integer n
        (1≤n≤100
        ) — the number of people who were asked to give their opinions.

        The second line contains n
        integers, each integer is either 0
        or 1
        . If i
        -th integer is 0
        , then i
        -th person thinks that the problem is easy; if it is 1
        , then i
        -th person thinks that the problem is hard.

        Output
        Print one word: "EASY" if the problem is easy according to all responses, or "HARD" if there is at least one person who thinks the problem is hard.

        You may print every letter in any register: "EASY", "easy", "EaSY" and "eAsY" all will be processed correctly.

        Examples
        input
        3
        0 0 1
        output
        HARD
        */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_of_people = sc.nextInt();
        int[] array =new int[number_of_people];
        int flag = 0;
        for(int no_of_options=0 ; no_of_options<number_of_people; no_of_options++){
            System.out.println("please enter your option if easy = 0 / hard = 1 ");
            int list_for_problem_type = sc.nextInt();
            if(list_for_problem_type != 0 && list_for_problem_type != 1) {
                System.out.println("please enter vaild data");
                no_of_options=no_of_options-1;
                continue;
            }
            array[no_of_options] = list_for_problem_type;
        }
        for( int i = 0 ;i< array.length ;i++) {
            System.out.print(array[i] + " ");
            if(array[i] == 1){
                flag= 1;
                continue;
            }
        }
        if(flag == 1){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
    }
}
