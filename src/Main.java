import java.util.ArrayList;
import java.util.Scanner;       // import needed to use the Scanner

/**
 * Created by Mateo on 24/05/2017.
 */
public class Main {

    public static void main(String[] args) {

        // lol kden

        Scanner scan = new Scanner(System.in);      // Reading input from System.in, which is the keyboard
        String s = scan.next();                     // reads in text

        System.out.println("Enter a number: ");     // prints out asking the user to enter a number
        int i = scan.nextInt();                     // reads in a nmber the user types in (must be an int or will stop program)
        System.out.println("The number you put in is: " + i);   // prints out what number the user typed in


        ArrayList<Card> deck = new ArrayList<>();

        Card archer = new Card("Archer", 10, 30);
        Warrior warrior = new Warrior("Warrior", 20, 20, 20);
        Card kleoTheledge = new Card("Kleo", 100, 100);

        deck.add(archer);
        deck.add(warrior);
        deck.add(kleoTheledge);


        int defence = 5;
        int attack = 5;

        for (int index = 0; index <= 16; index++)

        {

            Card npc = new Card("Fred", defence, attack);


            defence = defence + 5;
            attack = attack + 5;

            deck.add(npc);
        }


        Card first = deck.get(0);

        System.out.println("The name of the card is " + first.getName());

        System.out.println("First card attack " + first.getAttack());

        System.out.println("First card defence " + first.getDefence());


        Card seventh = deck.get(6);

        System.out.println("The name of the card is " + seventh.getName() + " Attack is " + seventh.getAttack() + " Defence is " + seventh.getDefence());

        if (first.getAttack() > seventh.getDefence()) {

            System.out.println("Player 1 wins");

        } else {

            System.out.println("Player 2 wins");
        }


        //These are objects which are used to create an instance of the class.
        Test test = new Test("T");

        Test test1 = new Test();

        System.out.println(test.getName());

        System.out.println(test1.getName());

        test.setName("P");

        System.out.println(test.getName());


        MateoTask caller = new MateoTask();

        int average = caller.getAverage(12, 20, 34);

        caller.getSmallest(10, 7, 11);

        System.out.println(average);
    }

}
