package Problem_Solving;
import java.util.Scanner;                                   //Enter number of lines = 10
public class good_numbers_prob15 {                          //Enter the limitation for ur number =6
    public static void main(String[] args) {                //line :  1 =  0123456   //line :  5 =  0123456  //line : 9 =  800
        Scanner sc = new Scanner(System.in);                //line :  2 =  0123456   //line :  6 =  0123456  //line : 10 =  124
        System.out.println("Enter number of lines");        //line :  3 =  0123456   //line :  7 =  2225
        int limes_no = sc.nextInt();  //4                   //line :  4 =  0123456   //line :  8 =  9428   , output = 6
        System.out.println("Enter the limitation for ur number");
        int limitation_no = sc.nextInt();
        int count_in_line = 0;
        int result = 0;
        // to pass through all the input no of lines
        for(int line = 1; line <= limes_no; line++){
            System.out.print("line :  " + line + " =  ");
            // make the number string to get the methods od contains and append by stringbuilder
            String numbers_in_line = sc.next(); //1234560 = 7
            // make an empty array string to store the value of line input
            StringBuilder array_st = new StringBuilder();
            array_st.append(numbers_in_line);   // 1234560
            // to check that the array doest contains 0 and also the no of lines can be divided by 10
            if(!array_st.toString().contains("0") && limes_no %10 == 0){
                array_st.append("0");
            }
            // to pass through the array and check that the array contains number from 0 till the limitation value
            for (int pt_digits = 0 ; pt_digits <= limitation_no + 1 ; pt_digits++){
                // change the array to string to get method contains them chamge the int pt_digits to string
               if(array_st.toString().contains(Integer.toString(pt_digits))){
                   count_in_line ++;
               }continue;
            }
            if(count_in_line==limitation_no+1){
                result++;
            }
            // to start new iteration with zero count for no cumulative value
            count_in_line=0;
        }
        System.out.println("your value is = " + result);
    }
}