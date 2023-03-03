package Problem_Solving;
import java.util.*;
// this problem we taken from user array of color horse's shoes and return how many matched color that we needed to buy it
// horse_color           =                  [7,7,7,7] , [50,2,5,50]
// output color matched that we needed to buy it = 3 , 1
public class Is_your_horseshoe_on_the_other_hoof_prob17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // used set as an input to remove all the duplicated numbers
        Set<Integer> horseshoes_color = new HashSet<Integer>();
        System.out.println("Enter the size number for the shoes {4} ");
        int count = 0;
        for (int i = 0; i < 4; i++) {
            int z = i + 1;
            System.out.println("enter shoes color no. " + z);
            horseshoes_color.add(sc.nextInt());
        }
        System.out.println(horseshoes_color);
        int num = 4 - horseshoes_color.size();
        System.out.println(num);
    }
}