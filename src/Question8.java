
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author messr2578
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new integer for the player
        int player = 1;
        // Creater the input for the user
        Scanner input = new Scanner(System.in);
        while (player != 100) {
            //get the dice roll from the user
            System.out.println("Enter sum of dice");
            int roll = input.nextInt();
            // terminate if roll is equal to 0
            if (roll == 0) {
                System.out.println("You Quit!");
                break;
            }
            // calculate the players spot on the board
            player = player + roll;
            // check to see if the player can move
            if (player > 100) {
                player = player - roll;
            }
            //check to see if the player is on a snake or a ladder 
            if (player == 54) {
                player = 19;
            } else if (player == 90) {
                player = 48;
            } else if (player == 99) {
                player = 77;
            } else if (player == 9) {
                player = 34;
            } else if (player == 40) {
                player = 64;
            } else if (player == 67) {
                player = 86;
            }
            System.out.println("you are now on square " + player);
        }
        if (player == 100) {
            System.out.println("YOU WIN!!!!");
        }
    }
}
