import java.util.Scanner;       // import needed to use the Scanner

/**
 * Created by Mateo on 24/05/2017.
 */
public class Main {

    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);      // Reading input from System.in, which is the keyboard
        String s = scan.next();                     // reads in text
        
        System.out.println("Enter a number: ");     // prints out asking the user to enter a number
        int i = scan.nextInt();                     // reads in a nmber the user types in (must be an int or will stop program)
        System.out.println("The number you put in is: " + i);   // prints out what number the user typed in
    }


}
