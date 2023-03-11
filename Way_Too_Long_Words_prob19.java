package Problem_Solving;
//Input
//Each of the following n lines contains one word. All the words consist of letters,
//if the length more than 10 print 1st letter,last letter and in between the size of letters.
//Output
//Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data.
//(input)                                              (output)
// 4
// word                                               =  word
// localization                                       =  l10n
// internationalization                               =  i19n
// pneumonoultramicroscopicsilicovolcanoconiosis      =  i43s
import java.util.Scanner;
public class Way_Too_Long_Words_prob19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number of words you need to count it :");
        int num_of_words = sc.nextInt();
        for (int line = 0 ; line < num_of_words ; line++){
            char [] word = sc.next().toCharArray();
            if (word.length > 10){
                System.out.println(word[0] + "" + (word.length-2) + "" + word[word.length-1]);
                continue;
            }
            System.out.println(word);

        }
    }
}