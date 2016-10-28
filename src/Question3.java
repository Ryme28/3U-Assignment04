
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author messr2578
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creater the input for the user
        Scanner input = new Scanner(System.in);
        //read the four lines of input
        System.out.println("please input four numbers on separate lines");
        double one = input.nextInt();
        double two = input.nextInt();
        double three = input.nextInt();
        double four = input.nextInt();
        //read back the four numbers
        System.out.println("your numbers were");
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
    }
}
