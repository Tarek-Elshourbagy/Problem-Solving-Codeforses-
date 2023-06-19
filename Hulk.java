package Problem_Solving;
import java.util.Scanner;
public class Hulk {
    /*
    Dr. Bruce Banner hates his enemies (like others don't). As we all know, he can barely talk when he turns into the incredible Hulk. That's why he asked you to help him to express his feelings.

Hulk likes the Inception so much, and like that his feelings are complicated. They have n layers. The first layer is hate, second one is love, third one is hate and so on...

For example if n=1, then his feeling is "I hate it" or if n=2 it's "I hate that I love it", and if n=3 it's "I hate that I love that I hate it" and so on.

Please help Dr. Banner.
     */
    public static void main(String[] args) {
        for (int j = 0;j<4;j++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter valid data for ur feeling[1,2,3]");
            int layers = sc.nextInt();
            if (layers == 1 || layers == 2 || layers == 3) {
                StringBuilder sentence = new StringBuilder("i hate");
                if (layers == 1) {
                    sentence.append(" it");
                } else if (layers == 2) {
                    sentence.append(" that I love it");
                } else {
                    sentence.append(" that I love that I hate it");
                }
                System.out.println(sentence);
            } else {
                System.out.println("please enter valid data");
                continue;
            }
        }
    }
}
