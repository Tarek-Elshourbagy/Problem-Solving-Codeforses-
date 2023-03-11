package Problem_Solving;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Coins_prob18 {
    //    input                 input
//    - A>B                 - A<B               a>b>c = a=2.b=1.c=0
//    - C<B                 - B>C
//    - A>C                 - C>A
//    output                output
//    = CBA                 = ACB
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int C = 0;
        for (int lines = 0; lines < 3; lines++) {
            System.out.println("please Enter your value no " + (lines + 1) + " :");
            String values = sc.next();
            char [] num = values.toCharArray(); // change from string to array
            if (num[1] == '>'){
                if(num[0] == 'A'){
                    A++;
                }else if(num[0] == 'B'){
                    B++;
                }else {
                    C++;
                }
            } else if (num[1] == '<') {
                if(num[2] == 'A'){
                    A++;
                }else if(num[2] == 'B'){
                    B++;
                }else {
                    C++;
                }
            }
            // to print in each iteration
            System.out.print("A " + A);
            System.out.print("  B " + B);
            System.out.println("  C " + C);
        }
        if (A == B || A == C || C == B){ // checking the possibility
            System.out.println("impossible");
        }
        // the final output
        if( A == 2 ){
            if ( B == 1){
                System.out.println("CBA");
            } else {
                System.out.println("BCA");
            }
        }
        if( B == 2 ){
            if ( C == 1){
                System.out.println("ACB");
            } else {
                System.out.println("CAB");
            }
        }
        if( C == 2 ){
            if ( B == 1){
                System.out.println("ABC");
            } else {
                System.out.println("BAC");
            }
        }
    }
}
