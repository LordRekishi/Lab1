package se.iths.java21.patrik.lab1;

import se.iths.java21.patrik.lab1.tools.ValueLookup;

import java.util.Scanner;

public class OrdningOchReda {

    static Scanner scanner = new Scanner(System.in);

    public static void ordningOchReda() {
        System.out.println("""
                                              
                ORDNING OCH REDA
                                
                HOW TO PLAY:
                Write FIVE numbers, seperated by SPACE
                Then press ENTER
                                
                Program will return smallest, second smallest, second largest, and largest number
                As well as if numbers were entered in order, and the sum of all numbers put together.
                                
                GOOD LUCK!
                """);

        gamePlay();
    }

    private static void gamePlay() {
        int[] newArray = inputArray();
        boolean sorted = isSorted(newArray);
        ValueLookup valueOrdningOchReda = new ValueLookup(newArray);

        printOut(valueOrdningOchReda.getLargest(), valueOrdningOchReda.getSecondLargest(), valueOrdningOchReda.getSecondSmallest(), valueOrdningOchReda.getSmallest(), sum(newArray), sorted);
    }

    private static int[] inputArray() {
        int[] newArray = new int[5];

        for (int i = 0; i < newArray.length; i++) {
            try {
                newArray[i] = Integer.parseInt(scanner.next());
            } catch (NumberFormatException ignore) {
                System.out.println("Invalid input, write one more number for each invalid input!");
                --i;
            }
        }
        return newArray;
    }

    public static int sum(int[] input) {
        int sum = 0;

        for (int value : input) {
            sum += value;
        }
        return sum;
    }

    public static boolean isSorted(int[] newArray) {
        for (int i = 0; i < newArray.length - 1; i++) {

            if (newArray[i] > newArray[i + 1]) {
                return false;
            }

        }
        return true;
    }

    private static void printOut(int largest, int secondLargest, int secondSmallest, int smallest, int sum, boolean sorted) {
        String isSorted;

        if (sorted)
            isSorted = "Yes";
        else
            isSorted = "No";

        System.out.println("\nSmallest value: " + smallest);
        System.out.println("Second Smallest value: " + secondSmallest);
        System.out.println("Second Largest value: " + secondLargest);
        System.out.println("Largest value: " + largest);
        System.out.println("In order: " + isSorted);
        System.out.println("Sum: " + sum);

        returnToMenu();
    }

    private static void returnToMenu() {
        System.out.println("""

                Thank you for playing, do you want to return to Main Menu? (Y/N)""");

        scanner.nextLine();
        String exitInput = scanner.nextLine();

        if (exitInput.equalsIgnoreCase("n"))
            ordningOchReda();
        else
            Main.mainMenu();
    }
}
