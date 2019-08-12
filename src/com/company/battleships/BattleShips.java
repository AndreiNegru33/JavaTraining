package src.com.company.battleships;

import java.util.Scanner;

public class BattleShips {

    public static void main(String[] args) {

        System.out.println("Bine ai venit!");
        if (!welcome()) return;

        Game game1 = new Game();
        game1.playGame();

    }

    private static boolean welcome() {  // TODO ane: move the scanner to it's own package in this package called io (inputoutput)
        // you should only have one scanner that reads all the yes no question and also the guesses, as there is no point in opening multiple console sessions
        // the scanner should also accept a restart game command so that we don't have to run the app every time we want to restart the game, plus a exit command so that we can exit whenever we want

        System.out.println("Doresti sa incepi jocul? (y/n)");

        Scanner s = new Scanner(System.in);
        String reply = s.next();
        if (reply.equals("y")) {
            return true;
        } else if (reply.equals("n")) {
            System.out.println("Sa ai o zi frumoasa!");
            return false;
        } else {
            System.out.println("Ce-ai facut? N-ai citit paranteza?");
            System.out.println();
            return welcome();

        }
    }
}