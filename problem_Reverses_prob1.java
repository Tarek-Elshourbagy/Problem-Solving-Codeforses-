package Problem_Solving;

import java.util.Scanner;

public class problem_Reverses_prob1 {

    // this a function to take the num and return the reverse for it
        public static void rev (int num) {
            // this method is used to change the integer to string
            String NumberasString = Integer.toString(num);
            // we used String builder method to take the last number
            // in the input number and append it as a first number
            StringBuilder x = new StringBuilder();
            for (int i = NumberasString.length() - 1 ; i >=0 ; i--){
                //to start with the last digit and append it in new obj X
                x.append(NumberasString.charAt(i)).append(" ");
            }
            System.out.println("The reversed number is    " + x);
        }
    public static void main(String[] args) {
        Scanner Name = new Scanner(System.in);
        System.out.println("enter the number to reverse it ");
        int number = Name.nextInt();
        rev(number);
    }
}

//                 " another solution "

    /* public static void rev (int nam) {
        int count = 0;
        String m = " ";
        while (nam != 0) {
            int y = nam % 10;
            count = y + count*10;
            System.out.println(count);
            nam = nam / 10;
        }
    }  */

