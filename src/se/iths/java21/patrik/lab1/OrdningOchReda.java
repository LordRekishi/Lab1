package se.iths.java21.patrik.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class OrdningOchReda {

    static Scanner scanner = new Scanner(System.in);

    public static void ordningOchReda() {
        System.out.println("""
                                
                Running program... Ordning och Reda!
                                
                HOW TO PLAY:
                Write five numbers, seperated by space
                Then Enter
                
                GOOD LUCK!
                """);

        gamePlay();
    }

    private static void gamePlay() {
        int[] newArray = inputArray();
        boolean sorted = isSorted(newArray);
        sorter(newArray);
        printOut(newArray, sum(newArray), sorted);
    }

    private static int[] inputArray() {
        int[] newArray = new int[5];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = Integer.parseInt(scanner.next());
        }
        return newArray;
    }

    public static int sum(int[] input) {
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            sum += input[i];
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

    private static void printOut(int[] inputArray, int sum, boolean sorted) {
        String isSorted;

        if (sorted == true)
            isSorted = "Yes";
        else
            isSorted = "No";

        System.out.println("\nMin value: " + inputArray[0]);
        System.out.println("2Min value: " + inputArray[1]);
        System.out.println("2Max value: " + inputArray[3]);
        System.out.println("Max value: " + inputArray[4]);
        System.out.println("I ordning: " + isSorted);
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
