
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author messr2578
 */
public class Question5 {

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
        // ask for what the first test is out of
        System.out.println("What's your first test out of");
        // Get the what the first test is out of from the user
        double test1 = input.nextDouble();
        // ask for what the got on the first test
        System.out.println("What did you get on your first test");
        // Get the mark from the user
        double mark1 = input.nextDouble();
        // ask for what the first test is out of
        System.out.println("What's your second test out of");
        // Get the what the first test is out of from the user
        double test2 = input.nextDouble();
        // ask for what the got on the second test
        System.out.println("What did you get on your second test");
        // Get the mark from the user
        double mark2 = input.nextDouble();
        // ask for what the first test is out of
        System.out.println("What's your third test out of");
        // Get the what the first test is out of from the user
        double test3 = input.nextDouble();
        // ask for what the got on the third test
        System.out.println("What did you get on your third test");
        // Get the mark from the user
        double mark3 = input.nextDouble();
        // ask for what the first test is out of
        System.out.println("What's your fourth test out of");
        // Get the what the fourth test is out of from the user
        double test4 = input.nextDouble();
        // ask for what the got on the fourth test
        System.out.println("What did you get on your fourth test");
        // Get the mark from the user
        double mark4 = input.nextDouble();
        // ask for what the first test is out of
        System.out.println("What's your fifth test out of");
        // Get the what the fith test is out of from the user
        double test5 = input.nextDouble();
        // ask for what the got on the first test
        System.out.println("What did you get on your first test");
        // Get the mark from the user
        double mark5 = input.nextDouble();
        // calculate percentages
        double total1 = (mark1 / test1) * 100;
        double total2 = (mark2 / test2) * 100;
        double total3 = (mark3 / test3) * 100;
        double total4 = (mark4 / test4) * 100;
        double total5 = (mark5 / test5) * 100;
        double total = total1 + total2 + total3 + total5 + total4;
        double average = (total / 5);
        // tell the user their test scores
        System.out.println("test scores for " + name);
        System.out.println(total1 + "%");
        System.out.println(total2 + "%");
        System.out.println(total3 + "%");
        System.out.println(total4 + "%");
        System.out.println(total5 + "%");
        // tell the user their average
        System.out.println("average" + average);

    }
}
