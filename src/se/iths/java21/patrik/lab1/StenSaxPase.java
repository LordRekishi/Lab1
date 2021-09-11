package se.iths.java21.patrik.lab1;

import java.util.Random;
import java.util.Scanner;

public class StenSaxPase {

    static int playerScore;
    static int computerScore;
    static String[] choices = {"STEN", "SAX", "PÅSE"};

    static Scanner scanner = new Scanner(System.in);

    public static void stenSaxPase() {

        playerScore = 0;
        computerScore = 0;

        System.out.println("""
                                
                STEN SAX PÅSE
                                
                HOW TO PLAY:
                Choose between STEN, SAX or PÅSE by typing the word in the console
                Then press ENTER
                                
                Sten beats Sax!
                Sax beats Påse!
                Påse beats sten!

                First to reach a score of 3 wins!
                                
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

        if (playerChoice == computerChoice) {
            System.out.println("\nYou both picked " + choices[playerChoice] + ", nobody wins!");
        } else if (winCheck(playerChoice, computerChoice)) {
            System.out.println("\nThe Computer picked " + choices[computerChoice] + ". " + choices[playerChoice] + " beats " + choices[computerChoice] + "! You WIN!");
            playerScore++;
        } else {
            System.out.println("\nThe Computer picked " + choices[computerChoice] + ". " + choices[computerChoice] + " beats " + choices[playerChoice] + "! You LOSE!");
            computerScore++;
        }

        printScore();

        if (playerScore < 3 && computerScore < 3) {
            gamePlay();
        }
        if (playerScore == 3) {
            System.out.println("\nCongratulations, you have beaten the computer!");
        } else if (computerScore == 3) {
            System.out.println("\nThe computer have beaten you...");
        }
        returnToMenu();
    }

    private static boolean winCheck(int playerChoice, int computerChoice) {
        if (playerChoice == 0 && computerChoice == 1)
            return true;
        else if (playerChoice == 1 && computerChoice == 2)
            return true;
        else return playerChoice == 2 && computerChoice == 0;
    }

    private static void printScore() {
        System.out.println("\nCurrent Score");
        System.out.println("Player: " + playerScore);
        System.out.println("Computer: " + computerScore);
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
