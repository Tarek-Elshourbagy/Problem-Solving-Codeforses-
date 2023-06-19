package Problem_Solving;
import java.util.Scanner;
public class Suffix_Three {
    /*
We just discovered a new data structure in our research group: a suffix three!

        It's very useful for natural language processing. Given three languages and three suffixes, a suffix three can determine which language a sentence is written in.

        It's super simple, 100% accurate, and doesn't involve advanced machine learning algorithms.

        Let us tell you how it works.

        If a sentence ends with "po" the language is Filipino.
        If a sentence ends with "desu" or "masu" the language is Japanese.
        If a sentence ends with "mnida" the language is Korean.
        Given this, we need you to implement a suffix three that can differentiate Filipino, Japanese, and Korean.

        Oh, did I say three suffixes? I meant four.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number of test cases");
        int t = sc.nextInt();
        for(int test=0;test<t;test++){
            String sentence = sc.next();
            if (sentence.endsWith("po")){
                System.out.println("FILIPINO");
            }else if(sentence.endsWith("desu")||sentence.endsWith("masu")){
                System.out.println("JAPANESE");
            }
            else{
                System.out.println("KOREAN");
            }
        }
    }
}
