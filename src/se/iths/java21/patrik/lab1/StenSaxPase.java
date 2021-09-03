package se.iths.java21.patrik.lab1;

import java.util.Random;
import java.util.Scanner;

public class StenSaxPase {

    static Scanner scanner = new Scanner(System.in);

    public static void stenSaxPase() {

        System.out.println("""
                                
                Running program... Sten Sax Påse!
                                
                HOW TO PLAY:
                This is a fight against the machine!
                Write "Sten", "Sax" or "Påse" in the console.
                Sten beats Sax!
                Sax beats Påse!
                Påse beats sten!
                GOOD LUCK!
                """);

        int playerChoice = getPlayerChoice();
        choiceCheck(playerChoice);

        returnToMenu();
    }

    private static int getPlayerChoice() {

        while (true) {

            String input = scanner.nextLine().toUpperCase();

            if (input.equalsIgnoreCase("sten") || input.equalsIgnoreCase("sax") || input.equalsIgnoreCase("påse")) {
                int playerChoice = switch (input) {
                    case "STEN" -> 0;
                    case "SAX" -> 1;
                    case "PÅSE" -> 2;
                    default -> getPlayerChoice();
                };
                return playerChoice;
            }
            else
                System.out.println("Not valid choice, try again:");
        }
    }

    private static void choiceCheck(int playerChoice) {
        Random random = new Random();
        int computerChoice = random.nextInt(3);

        if (playerChoice == 0) {
            if (computerChoice == 0)
                System.out.println("Both you and the computer picked Sten, nobody wins!");
            else if (computerChoice == 1)
                System.out.println("You picked Sten, the computer picked Sax. YOU WIN!");
            else
                System.out.println("You picked Sten, the computer picked Påse. COMPUTER WINS!");
        }
        if (playerChoice == 1) {
            if (computerChoice == 0)
                System.out.println("You picked Sax, the computer picked Sten. COMPUTER WINS!");
            else if (computerChoice == 1)
                System.out.println("Both you and the computer picked Sax. Nobody wins!");
            else
                System.out.println("You picked Sax, the computer picked Påse. YOU WIN!");
        }
        if (playerChoice == 2) {
            if (computerChoice == 0)
                System.out.println("You picked Påse, the computer picked Sten. YOU WIN!");
            else if (computerChoice == 1)
                System.out.println("You picked Påse, the computer picked Sax. COMPUTER WINS!");
            else
                System.out.println("Both you and the computer picked Påse. Nobody wins!");
        }
    }

    private static void returnToMenu() {
        System.out.println("""

                Thank you for playing, do you want to return to Main Menu? (Y/N)""");
        String exitInput = scanner.nextLine();

        if (exitInput.equalsIgnoreCase("n"))
            stenSaxPase();
    }
}
