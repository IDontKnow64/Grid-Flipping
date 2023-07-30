/*
Name: Tommy
Date: 24/10/2022
This program takes an input of a sequence of horizontal and vertical flips for a 2x2 grid that consists of (A,B,C,D)
and outputs the final orientation of the grid
 */
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //creates a scanner
        System.out.println("Enter the sequence you want the grid to be flipped in; H for Horizontal and V for Vertical");
        //asks the user for input
        String str = scanner.next();            //takes input from the user for the sequence of flips
        char[] grid = {'A','B','C','D'};        //initializes and declare the array, the grid.

        for (int i = 0; i < str.length(); i++){     //for loop that runs for the length of the sequence

            char temp = grid[0];            //creates a variable to hold the letter in the top left
            char temp2 = grid[3];           //creates a variable to hold the letter in the bottom right

            if (str.charAt(i) == 'H'){      //checks if the flip is horizontal
                grid[0] = grid[2];          //sets the top left char to the bottom left char
                grid[2] = temp;
                //sets the bottom left char to top left char through temp
                //horizontal switch in column 1
                grid[3] = grid[1];          //sets the top right char to the bottom right char
                grid[1] = temp2;
                //sets the bottom right char to the top left char through temp2
                //horizontal switch in column 2
            }
            else{                           //if the flip is not horizontal, then it is a vertical flip
                grid[0] = grid[1];          //sets the top left char to the top right char
                grid[1] = temp;
                //sets the top right char to the top left char through temp
                //vertical switch in row 1
                grid[3] = grid[2];          //sets the bottom right char to the bottom left char
                grid[2] = temp2;
                //sets the bottom left char to the bottom right char through temp2
                //vertical switch in row 2

            }
        }
        System.out.println("Your new grid is:");
        System.out.println(grid[0]+" "+ grid[1] + "\n" + grid[2] + " " + grid[3]);
        // prints the final order of the grid after the sequence
    }
}
