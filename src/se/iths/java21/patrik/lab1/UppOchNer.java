package se.iths.java21.patrik.lab1;

import se.iths.java21.patrik.lab1.tools.DynamicArray;

import java.util.Scanner;

public class UppOchNer {

    static Scanner scanner = new Scanner(System.in);

    public static void uppOchNer() {

        System.out.println("""
                                
                UPP OCH NER
                                
                HOW TO PLAY:
                Continue writing WORDS and press ENTER in between
                When you're ready write END to reverse the order
                                
                GOOD LUCK!
                """);

        gamePlay();
        returnToMenu();
    }

    private static void gamePlay() {
        DynamicArray inputList = new DynamicArray();

        while (true) {
            if (inputToArrayList(inputList)) break;
        }

        printOut(inputList);
    }

    private static boolean inputToArrayList(DynamicArray inputList) {
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("END")) {
            return true;
        } else {
            inputList.add(input);
        }
        return false;
    }

    private static void printOut(DynamicArray inputList) {
        for (int i = inputList.length() - 1; i >= 0; i--) {
            System.out.println(inputList.get(i));
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
