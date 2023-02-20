package Problem_Solving;

import java.util.Scanner;
public class search_in_matrix_prob4 {
    // make matrix and search for no. in it
        public static void main(String[] args) {

            // user inputs

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the row number ");
            int row = sc.nextInt();
            System.out.println("Enter the column number ");
            int col = sc.nextInt();
            int[][] number_of_Matrix = new int[row][col];

            // to create the Matrix

            System.out.println("Enter the Matrix Element ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    number_of_Matrix[i][j] = sc.nextInt();
                }
            }

            // to print the matrix for the user

            System.out.println("Matrix ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(number_of_Matrix[i][j] + "  ");
                }
                System.out.println();
            }

            // to take the no and search for it the matrix

            System.out.println("Enter the search no");
            int x = sc.nextInt();
            int flag = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (number_of_Matrix[i][j] == x) {
                        flag = 1 ;
                    }
                    else {
                        flag = 2;
                    }
                }
            }
            if (flag == 1){
                System.out.println("dont take the number");
            }
            else {
                System.out.println("take the number");
            }
        }
    }

