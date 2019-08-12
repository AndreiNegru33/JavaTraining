package src.com.company.battleships;

import java.util.Scanner;

class Game {
    private int[] ship = new int[10];
    private int numberOfTries = 0;
    private int numberOfHits = 0;

    {
        int shipFront = (int) (Math.random() * 8);
        ship[shipFront] = 1;
        ship[shipFront + 1] = 1;
        ship[shipFront + 2] = 1; // TODO ane: can you explain in why there is no danger of getting an index out of bounds ex here?

    }

    void playGame() {

        Scanner s = new Scanner(System.in);

        System.out.println("Incearca sa scufunzi nava!!! (pozitii intre 0 si 9)");

        while (numberOfHits != 3) {

            String stringGuess = s.next();

            try {
                int guess = Integer.parseInt(stringGuess);
                numberOfTries++;
                checkGuess(guess);
            } catch (Exception e) {
                System.out.println("Incearca numere de la 0 la 9");
            }

        }

    }

    private void checkGuess(int guess) {

        if (ship[guess] == 0) {
            System.out.println("Ai ratat");
        } else if (ship[guess] == -1) {
            System.out.println("Era deja lovit");
        } else if (ship[guess] == 1 && numberOfHits != 2) {
            System.out.println("Ai lovit");
            ship[guess] = -1; // TODO ane: set -1 or another code when I also miss. at this moment I can press 2 10_000 times and there won't be a problem for the app
            numberOfHits++;
        } else if (ship[guess] == 1 && numberOfHits == 2) {
            System.out.println("Felicitari! Ai distrus nava din " + numberOfTries + " incercari.");
            numberOfHits++;
        }
    }
}
