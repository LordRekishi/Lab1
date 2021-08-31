package se.iths.java21.patrik.lab1;

/*
Alternativet Min Max ska fungera ungefär som uppgift 2 men nu ska vi istället
läsa in 5 heltal och när inläsningen är klar ska vi skriva ut det minsta och det
största talet av de inlästa. Även negativa tal ska kunna hanteras.
Uppgiften kan lösas antingen med hjälp av en array som lagrar talen som läses in
eller så lagrar man bara det hittills största och minsta talet i två variabler.
(En lösning som använder 5 variabler är inte godkänd.)
        Exempel på inläsningen
        1
        2
        10
        -2
        100
        Min value: -2
        Max value: 100
*/

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
