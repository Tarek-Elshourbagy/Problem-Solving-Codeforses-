package Problem_Solving;

import java.util.Scanner;

public class balance_scale_prob12 {
    //input:  AC|T       //input:  |ABC          //input: W|T              //input: ABC|
    //        L          //        XYZ           //       F                //       D
    //output: AC|TL      //output: XYZ|ABC       //output: Impossible      //output: Impossible
    public static void main(String[] args) {
        // the inputs
        Scanner sc = new Scanner(System.in);
        String first_weight = sc.next().toUpperCase();   // A|TC
        String second_weight = sc.next().toUpperCase();  // L
        // strings to store the inputs
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        StringBuilder z = new StringBuilder();
        // calc the summation for the two weights in one array
        String totel_length = (first_weight + second_weight).toUpperCase(); // A|TCL
        // make a condition for if the input doesn't contain {|}, return to the inputs again
        if (totel_length.contains("|")) {
            int scale = totel_length.indexOf("|");
            // 1- if {|} at the first letter in the array = |DD ,LL
            if (scale == 0) {
                String final_resault = second_weight + first_weight; //LL|DD
                x.append(final_resault);
                return_result(x);
            } else {
            // 2- if {|} at the middle but the right side is smaller than the left side = D|DE ,E {D|DEE}
                int check = totel_length.length() / scale; // 5/1 = 5
                if (check % 2 == 0) {       // 5 % 2 != 0 , so go to else cond.
                    String final_resault = first_weight + second_weight;
                    y.append(final_resault);
                    return_result(y);
                } else {                    // 5 % 2 != 0
                    String final_resault = second_weight + first_weight;   // ED|DE
                    z.append(final_resault);
                    return_result(z);
                }
            }
        } else {
            System.out.println("please enter the weights with'|'"); // this used if the user enter the input without {|}
        }
    }
    // this function used to check the balance scale = |FDE, MN = (MN|FDE) so that's an error
    // 1- make function takes stringbuilder array = MN|FDE
    public static void return_result(StringBuilder m) {
        int count_till_end = 0;
        int count_from_start = 0;
    // 2- to count the letters bellow {|} = FDE = 3
        for (int sec_part = m.indexOf("|") + 1; sec_part <= m.length() - 1; sec_part++) {
            count_till_end++;
        }
    // 3- to count the letters before {|} = MN  = 2
        for (int first_part = 0; first_part <= m.indexOf("|") - 1; first_part++) {
            count_from_start++;
        }
    // 4- Check if the two side are equal or not
        if (count_till_end == count_from_start) {
            System.out.println("possible");
            System.out.println(m);
        } else {
            System.out.println("impossible");

        }
    }
}

