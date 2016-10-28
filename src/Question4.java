
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author messr2578
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creater the input for the user
        Scanner input = new Scanner(System.in);
        //recieve the numbers for the total number of dollars
        System.out.println("How much does the food for prom cost?");
        double food = input.nextInt();
        System.out.println("How much does the DJ cost?");
        double DJ = input.nextInt();
        System.out.println("How much does it cost to rent the hall? ");
        double rent = input.nextInt();
        System.out.println("How much does decorations cost? ");
        double deco = input.nextInt();
        System.out.println("How much does it cost for staff? ");
        double staff = input.nextInt();
        System.out.println("How much for miscellaneous costs?");
        double misc = input.nextInt();
        // calculte the costs
        double cost = 0;
        cost = food + DJ + rent + deco + staff + misc;
        // calculate the ammount of ticket needed
        int ticket = 0;
        ticket = (int) Math.ceil(cost / 35);
        //return the ammount of tickets needed to sell
        System.out.println("the total cost is " + cost + " therefore you will need to sell " + ticket + " tickets to break even");
    }
}
