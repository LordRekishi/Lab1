package se.iths.java21.patrik.lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class UppOchNer {

    static Scanner scanner = new Scanner(System.in);

    public static void uppOchNer() {

        System.out.println("""
                                
                Running program... Upp och Ner!
                                
                HOW TO PLAY:
                Continue writing words and press Enter
                When you're ready write End to reverse the order
                
                GOOD LUCK!
                """);

        gamePlay();
        returnToMenu();
    }

    private static void gamePlay() {
        ArrayList<String> inputList = new ArrayList<>();

        while (true) {
            if (inputToArrayList(inputList)) break;
        }

        printOut(inputList);
    }

    private static boolean inputToArrayList(ArrayList<String> inputList) {
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("END")) {
            return true;
        } else {
            inputList.add(input);
        }
        return false;
    }

    private static void printOut(ArrayList<String> inputList) {
        for (int i = inputList.size() - 1; i <= inputList.size(); i--) {
            if (i >= 0)
                System.out.println(inputList.get(i));
            else
                break;
        }
    }

    private static void returnToMenu() {
        System.out.println("""

                Thank you for playing, do you want to return to Main Menu? (Y/N)""");
        String exitInput = scanner.nextLine();

        if (exitInput.equalsIgnoreCase("n"))
            uppOchNer();
        else
            Main.mainMenu();
    }

}
