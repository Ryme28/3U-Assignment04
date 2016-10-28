
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author messr2578
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creater the input for the user
        Scanner input = new Scanner(System.in);

        // ask user tio enter inches to convert
        System.out.println("input inches to convert");
        //store inches
        int inch = input.nextInt();
        //convert inches to centimeters
        double cm = inch * 2.54;
        //tell the user their birth year
        System.out.println(cm+"cm");


    }
}
