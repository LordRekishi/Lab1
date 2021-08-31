package se.iths.java21.patrik.lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class MinMax {

    static Scanner scanner = new Scanner(System.in);

    public static void minMax() {

        System.out.println("""
            
                Running program... Min Max!
                                
                HOW TO PLAY:
                Enter five numbers (both positive and negative are OK)
                When you have entered five numbers it will tell you the smallest and largest number.
                GOOD LUCK!
                """);

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

        sorter(inputArray);

        System.out.println("\n" +
                "THE RESULTS: ");
        System.out.println("Smallest Number: " + inputArray[0]);
        System.out.println("Largest Number: " + inputArray[4]);

        returnToMenu();

    }

    private static void sorter(int[] input) {
        int temp;

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
    }

    private static void returnToMenu() {
        System.out.println("""

                Thank you for playing, do you want to return to Main Menu? (Y/N)""");
        String exitInput = scanner.nextLine();

        if (exitInput.equalsIgnoreCase("n"))
            minMax();
    }

}
