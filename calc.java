package Problem_Solving;
import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ;i<4 ;i++) {
            System.out.println("enter a first number");
            int x = sc.nextInt();
            System.out.println("enter a second number");
            int y = sc.nextInt();
            System.out.println("enter the operator");
            char opp = sc.next().charAt(0);
            if (opp == '+' || opp == '-' || opp == '*' || opp == '/') {
                if (opp == '+') {
                    System.out.print("sum = ");
                    System.out.println(x + y);
                } else if (opp == '*') {
                    System.out.print("mult = ");
                    System.out.println(x * y);
                } else if (opp == '-') {
                    System.out.print("min = ");
                    System.out.println(x - y);
                } else {
                    System.out.print("div = ");
                    System.out.println(x / y);
                }
            } else {
                System.out.println("enter a valid data");
            }
        }
    }
}
