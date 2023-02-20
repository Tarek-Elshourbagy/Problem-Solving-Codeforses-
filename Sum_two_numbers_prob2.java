package Problem_Solving;

import java.util.Scanner;
public class Sum_two_numbers_prob2 {
    public static void main(String[] args) {

        // user inputs will enter no and two values and the output
        // should be the summation for any numbers or digits in between the values.
        // no = 20 [1,2,3,4,5,6,7,8,9,10,11,12,13....20]
        // val1 = 2 , val2 = 5
        // output , sum = 2+3+4+5+11+12+13+14+20 = 84

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int sum = 0 ;

        for (int i = 1 ; i <= number; i++){   //12
            int firstDig = i / 10;        //15/10 = 1.2,1
            int secondDig = i % 10;       //15/10 = 1.2,2
            int sumtwoDig = firstDig + secondDig ; //1+2 = 3
            if ( sumtwoDig >= val1 && sumtwoDig <= val2 ) {
                sum = sum + i;
                continue;
            }
        }
        System.out.println(sum);
    }
}

//              "another way"

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            if (i % 10 == 0) {
//                if(i >= a && i <= b) {
//                    sum += i;
//                }
//            }
//            else {
//                int num = i ;
//                while (num > 0) {
//                    int the_1st_dugit = num % 10;
//                    int the_2nd_dugit = num / 10;
//                    int sum_2digits = the_1st_dugit + the_2nd_dugit;
//                    if (sum_2digits >= a && sum_2digits <= b) {
//                        sum = sum_2digits + sum;
//                    }
//                }
//            }
//
//            System.out.println(sum);
//
//        }
//    }