package se.iths.java21.patrik.lab1;

import java.util.Random;
import java.util.Scanner;

public class StenSaxPase {

    static int playerScore;
    static int computerScore;


    static Scanner scanner = new Scanner(System.in);

    public static void stenSaxPase() {

        playerScore = 0;
        computerScore = 0;

        System.out.println("""
                                
                Running program... Sten Sax Påse!
                                
                HOW TO PLAY:
                This is a fight against the machine!
                First to reach a score of 3 wins!
                Sten beats Sax!
                Sax beats Påse!
                Påse beats sten!
                GOOD LUCK!
                """);

        gamePlay();
    }

    private static void gamePlay() {
        int playerChoice = getPlayerChoice();
        choiceCheck(playerChoice);
    }

    private static int getPlayerChoice() {

        System.out.println("Please write Sten, Sax or Påse");

        while (true) {

            String input = scanner.nextLine().toUpperCase();

            switch (input) {
                case "STEN":
                    return 0;
                case "SAX":
                    return 1;
                case "PÅSE":
                    return 2;
            }
            System.out.println("Invalid choice, try again: ");
        }
    }

    private static void choiceCheck(int playerChoice) {

        Random random = new Random();
        int computerChoice = random.nextInt(3);

        if (playerChoice == 0) {
            if (computerChoice == 0) {
                System.out.println("\nBoth you and the computer picked Sten, nobody wins!");
            } else if (computerChoice == 1) {
                System.out.println("\nYou picked Sten, the computer picked Sax. YOU WIN!");
                playerScore++;
            } else {
                System.out.println("\nYou picked Sten, the computer picked Påse. COMPUTER WINS!");
                computerScore++;
            }
        }
        if (playerChoice == 1) {
            if (computerChoice == 0) {
                System.out.println("\nYou picked Sax, the computer picked Sten. COMPUTER WINS!");
                computerScore++;
            } else if (computerChoice == 1) {
                System.out.println("\nBoth you and the computer picked Sax. Nobody wins!");
            } else {
                System.out.println("\nYou picked Sax, the computer picked Påse. YOU WIN!");
                playerScore++;
            }
        }
        if (playerChoice == 2) {
            if (computerChoice == 0) {
                System.out.println("\nYou picked Påse, the computer picked Sten. YOU WIN!");
                playerScore++;
            } else if (computerChoice == 1) {
                System.out.println("\nYou picked Påse, the computer picked Sax. COMPUTER WINS!");
                computerScore++;
            } else {
                System.out.println("\nBoth you and the computer picked Påse. Nobody wins!");
            }
        }
        System.out.println("\nCurrent Score");
        System.out.println("Player: " + playerScore);
        System.out.println("Computer: " + computerScore);

        if (playerScore < 3 && computerScore < 3) {
            gamePlay();
        }

        if (playerScore == 3) {
            System.out.println("\nCongratulations, you have beaten the computer!");
            returnToMenu();
        } else if (computerScore == 3) {
            System.out.println("\nThe computer have beaten you...");
            returnToMenu();
        }
    }

    private static void returnToMenu() {
        System.out.println("""

                Thank you for playing, do you want to return to Main Menu? (Y/N)""");
        String exitInput = scanner.nextLine();

        if (exitInput.equalsIgnoreCase("n"))
            stenSaxPase();
        else
            Main.mainMenu();

    }
}
