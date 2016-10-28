
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author messr2578
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creater the input for the user
        Scanner input = new Scanner(System.in);
        // ask for the speed limit
        System.out.println("Enter the speed limit");
        //record the speed limit
        int limit = input.nextInt();
        // ask for the speed limit
        System.out.println("Enter the recorded speed of the car");
        //record the speed limit
        int mph = input.nextInt();
        int speed = mph - limit;
        //relay the fine to the user
        if (speed <= 20 && speed > 0) {
            System.out.println("you are speeding and your fine is $100");
        }else if (speed <= 30 && speed >= 21) {
            System.out.println("you are speeding and your fine is $270");
        }else if (speed >= 31) {
            System.out.println("you are speeding and your fine is $500");
        }
    }
}
