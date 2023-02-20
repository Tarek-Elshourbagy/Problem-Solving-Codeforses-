package Problem_Solving;

import java.util.Scanner;

public class PUM_prob3 {

    // input 7
    // output 7 lines like this
    // 1 2 3 PUM
    // 5 6 7 PUM
    // ..... 25 26 27 PUM
    public static void main(String[] args) {
        // inputs
        Scanner sc = new Scanner(System.in);
        int no_of_lines = sc.nextInt();

        // increasing the user inputs by 2.

        no_of_lines = no_of_lines + 2;
        int numbers = 0 ;
        for (int i = 1 ; i <= no_of_lines ; i++){
            numbers = numbers + 1;
            if (numbers % 4 ==0){
                System.out.print("PUM");
                System.out.println();
                i=i-3;
                continue;
            }
            System.out.print(numbers+" ");
        }
        System.out.print("PUM");
    }
}
