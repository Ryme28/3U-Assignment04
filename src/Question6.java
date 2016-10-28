
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author messr2578
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creater the input for the user
        Scanner input = new Scanner(System.in);
        //ask for the number of daytime minuites
        System.out.println("Number of daytime minuites");
        int day = input.nextInt();
        //ask for the number of evening minuites
        System.out.println("Number of evening minuites");
        int eve = input.nextInt();
        //ask for the number of weekend minuites
        System.out.println("Number of weekend minuites");
        int end = input.nextInt();
        //plan A calculations
        double planA = 0;
        if (day >= 101) {
            day = day - 100;
            planA = day * 25 + eve * 15 + end * 20;
        } else if (day <= 100) {
            planA = eve * 15 + end * 20;
        }
        //plan B calculations
        double planB = 0;
        if (day >= 251) {
            day = day - 250;
            planB = day * 45 + eve * 35 + end * 25;
        } else if (day <= 250) {
            planB = eve * 35 + end * 25;
        }
        if (planA < planB) {
            System.out.println("plan A is cheapest");
        }
        if (planA > planB) {
            System.out.println("plan B is cheapest");
        }
        if (planA == planB) {
            System.out.println("they are the same price");
        }
    }
}
