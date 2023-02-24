package Problem_Solving;

import java.util.Scanner;

public class Team_prob14 {
    // 3 questions , 3 Students , 1 answer , didn't answer
    // count the question if >=2 answers gain by students
    //q1 = 1 (1st), 1 (2nd), 0 (3rd)  count
    //q2 = 1 (1st), 1 (2nd), 1 (3rd)  count
    //q3 = 1 (1st), 0 (2nd), 0 (3rd)  don't count
    //output = 2.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_questions = sc.nextInt();
        int count = 0;
        System.out.println("please enter 1 if you answer and 0 if you didn't answer the question");
        for (int numbers_of_Q = 1; numbers_of_Q <= num_of_questions; numbers_of_Q++) { // to run the input i(n.quest) times
            System.out.println("q" + numbers_of_Q);
            int student1_ans = sc.nextInt();
            int student2_ans = sc.nextInt();
            int student3_ans = sc.nextInt();
            int num_of_correct_ans = student1_ans + student2_ans + student3_ans;
            if(num_of_correct_ans >= 2){
                count++;
            }
        }
        System.out.println("the result is =  " + count);
    }
}
