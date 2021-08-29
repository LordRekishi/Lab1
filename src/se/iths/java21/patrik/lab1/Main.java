package se.iths.java21.patrik.lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean menu = true;

        while (menu) {

            System.out.println("""
                    Welcome to Lab 1
                    Presented by: Patrik Fallqvist Magnusson

                    Game Menu
                    1. Upp och Ner
                    2. Min Max
                    3. Sten Sax Påse
                    4. Ordning och reda
                    e. Avsluta""");

            String menuChoice = scanner.nextLine().toUpperCase();

            switch (menuChoice) {
                case "1" -> UppOchNer();
                case "2" -> MinMax();
                case "3" -> StenSaxPase();
                case "4" -> OrdningOchReda();
                case "E" -> {
                    System.out.println("Program ending...");
                    menu = false;
                }
            }
        }
    }

    public static void UppOchNer() {

        System.out.println("""
                
                Running program... Upp och Ner!
                
                HOW TO PLAY:
                Continue writing words and press Enter
                When you're ready write End to reverse the order
                GOOD LUCK!
                """);

        ArrayList<String> inputList = new ArrayList<>();


        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("END")) {
                break;
            } else {
                inputList.add(input);
            }
        }

        for (int i = inputList.size() - 1; i <= inputList.size(); i--) {

            if (i >= 0)
                System.out.println(inputList.get(i));
            else
                break;
        }

        System.out.println("Thank you for playing, do you want to return to Main Menu? (Y/N)");
        String exitInput = scanner.nextLine();

        if (exitInput.equalsIgnoreCase("n"))
            UppOchNer();
    }

    public static void MinMax() {
    }

    public static void StenSaxPase() {
    }

    public static void OrdningOchReda() {
    }
}
