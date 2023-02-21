package Problem_Solving;

import java.util.Scanner;

public class left_handers_right_handers_prob11 {
                                                  // make a max team of this array to make the left hand = right hands
        public static void main(String[] args) {  // team ( left hands , right hands , both hands )
            Scanner sc = new Scanner(System.in);  // (1,4,2) # step 1
            int left = sc.nextInt();              // add the last value to the smallest val of the array
            int last = sc.nextInt();              // (3,4)   # step 2
            int right = sc.nextInt();             // then mult the smallest val * 2 to get the max no of team
            int result = 0;                       // 3 * 2 = 6  # step 3
            if (left < right){
                left = last + left;
            }
            else if (left > right) {
                right = right + last;
            }
            else {
                left =left + last/2;
                right = right + last/2;
                result = left + right ;
                System.out.println("The max no of player  =  " + result);
            }
            // used to show the numbers of player after adding the two hands players
            System.out.print(left);
            System.out.println("  "+ right);
            // this contions to make the teams contains the smallest values * 2
            if (left < right ){  // (4,8,3) (7,8) (7*2=14)
                result = left * 2;
                System.out.println("The max no of player  =  " + result);
            }
            else if ( left > right ){ // (4,1,2) (4,3) (3*2=6)
                result = right * 2;
                System.out.println("The max no of player  =  " + result);
            } else {
                result = right * 2; // this could be right or left (5,4,1) (5,5) (5*2=10)
                System.out.println("The max no of player  =  " + result);
            }
        }
    }

