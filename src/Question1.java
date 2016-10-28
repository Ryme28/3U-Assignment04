
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author messr2578
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Creater the input for the user
        Scanner input = new Scanner(System.in);
        // Ask for the users name
        System.out.println("What's your name");
        // Get the name from the user
        String name = input.nextLine();
         // Say hello
        System.out.println("Hello " + name);
    }
}
