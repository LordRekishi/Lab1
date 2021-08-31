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
                When you have entered five numbers it will tell you the smalles and largest number.
                GOOD LUCK!            
                """);

        int[] inputArray = new int[5];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("Please enter value " + (i + 1));
            int value = Integer.parseInt(scanner.nextLine());
            inputArray[i] = value;
        }

        int temp;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] > inputArray[j]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }

        System.out.println("\n" +
                "THE RESULTS: ");
        System.out.println("Smallest Number: " + inputArray[0]);
        System.out.println("Largest Number: " + inputArray[4]);

        System.out.println("""
                
                Thank you for playing, do you want to return to Main Menu? (Y/N)""");
        String exitInput = scanner.nextLine();

        if (exitInput.equalsIgnoreCase("n"))
            minMax();
    }
}
