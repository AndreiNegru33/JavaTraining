package src.com.company.battleships;

import java.util.Scanner;

public class BattleShips {
    public static void main(String[] args) {

        System.out.println("Bine ai venit!");
        if (!welcome()) return;

        Game game1 = new Game();
        game1.playGame();

    }

    private static boolean welcome() {

        System.out.println("Doresti sa incepeti jocul? (y/n)");

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
