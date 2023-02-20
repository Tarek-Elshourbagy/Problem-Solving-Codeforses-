package Problem_Solving;

import java.util.Scanner;

public class Yaroslav_and_Permutations_prob10 {
    //calc the if the number which enter by the user
    // can be rearranged with no number match the next one
    // user inout = 112
    // user output = yes , 121
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the number");
        int nummbers = sc.nextInt();
        String array = Integer.toString(nummbers);  // change the user int to string
        int z = array.length();     // get the total length of the user string
        int count = 1 ;
        for(int i = 0; i < z-1 ; i++){    // to pass through all the numbers for the input
            int m = i+1;     // take the nest number of the user
            char first_no = array.charAt(i);   // take the first no. in the array
            char second_no = array.charAt(m);  // take the second no. in the array
            if ( first_no == second_no){       // make sure that the no. will be equals
                count++ ;
                continue;                // start to count
            }
        }
        if ( z % 2 !=0) {   // to make sure if the length of the user array odd/even
           z = z + 1;     // if odd add 1 to the total array's length
        }
        else{
            z=z;      // if even dont make any change
        }
        System.out.println(z);
        System.out.println(count);
        int calc = z/2;  // to make sure that the number of matched items will no exceed the half of the total array
        if(count<=calc){
            System.out.println("YES");   // no exceed so we can rearrange it , without matching
        }
        else {
            System.out.println("NO");    // exceed cant arrange it again , without matching
        }
    }
}
