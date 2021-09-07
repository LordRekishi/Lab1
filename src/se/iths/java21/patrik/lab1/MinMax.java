package se.iths.java21.patrik.lab1;

import se.iths.java21.patrik.lab1.tools.ValueLookup;

import java.util.Scanner;

public class MinMax {

    static Scanner scanner = new Scanner(System.in);

    public static void minMax() {

        System.out.println("""
                            
                MIN MAX
                                
                HOW TO PLAY:
                Enter FIVE numbers (both positive and negative numbers are OK)
                Press ENTER between each number
                                
                When you have entered five numbers it will tell you the smallest and largest number.
                                
                GOOD LUCK!
                """);

        gamePlay();
    }

    private static void gamePlay() {
        int[] inputArray = getInputArray();
        ValueLookup lookupMinMax = new ValueLookup(inputArray);

        printOut(lookupMinMax.getLargest(), lookupMinMax.getSmallest());
        returnToMenu();
    }

    private static int[] getInputArray() {
        int[] inputArray = new int[5];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("Please enter value " + (i + 1));
            try {
                inputArray[i] = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ignore) {
                System.out.println("Your value exceeds the limit, try again!");
                i--;
            }
        }
        return inputArray;
    }

    private static void printOut(int largest, int smallest) {
        System.out.println("\n" +
                           "THE RESULTS: ");
        System.out.println("Smallest Number: " + smallest);
        System.out.println("Largest Number: " + largest);
    }

    private static void returnToMenu() {
        System.out.println("""

                Thank you for playing, do you want to return to Main Menu? (Y/N)""");
        String exitInput = scanner.nextLine();

        if (exitInput.equalsIgnoreCase("n"))
            minMax();
        else
            Main.mainMenu();
    }

}
