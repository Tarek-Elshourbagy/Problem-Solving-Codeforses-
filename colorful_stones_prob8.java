package Problem_Solving;

import java.util.Scanner;


public class colorful_stones_prob8 {
// the user will enter two names,the req is two check
// each letter in the another name or not and get its length
// name1 = R G R
// name2 = R R R
// output = 2.
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String name = sc.next();
        String check = sc.next();
        int pointer = 1 ;
            for(int j  = 0 ; j < check.length() ; j++){
                if (name.charAt(pointer-1) == check.charAt(j)){ //if the color matches, move to the next letter
                    pointer++;
                }
            }
        System.out.println(pointer);
        }
    }

