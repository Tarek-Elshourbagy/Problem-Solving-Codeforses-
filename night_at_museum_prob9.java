package Problem_Solving;
// write the word as an input
// then the output req to calc the distance between each letter and the other
// if it moved clockwise or anticlockwise
// word = azeus
// from 'a' to 'z' (1 rotation counterclockwise),
// from 'z' to 'e' (5 clockwise rotations),
// from 'e' to 'u' (10 rotations counterclockwise),
// from 'u' to 's' (2 counterclockwise rotations).
// sum = 1+5+10+2 = 18
import java.util.Scanner;
public class night_at_museum_prob9 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String word = sc.next().toLowerCase();            // enter the word by user . ares
        String letters = "abcdefghijklmnopqrstuvwxyz";    // all the alphabetic letters
        int sum = 0;           // to store the outputs for each iteration
        for (int i = 0; i < word.length() - 1; i++) {     // to pass in all the input word
            char z = word.charAt(i);          // take each letter separated . a
            char y = word.charAt(i+1);        // take the next letters separated . r
            int x = letters.indexOf(z);       // to take the index of each letter . 0
            int w = letters.indexOf(y);       // to take the index of each letter . 16
            int position = Math.abs ( x - w ); // make it in absolute for no negative value . 0-16=16
            if (position >= 13) {             // this cond. to make the short distance bet. clock or anticlockwise
                position = 26 - position ;    // this mean that the distance will be anticlockwise
            }
            System.out.println(position);     // to print each distance for each iteration
            sum = sum + position ;
        }
        System.out.println(sum);
    }
}