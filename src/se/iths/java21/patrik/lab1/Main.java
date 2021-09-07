package se.iths.java21.patrik.lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                                 
                Welcome to JAVA21 - Lab 1
                Made by: Patrik Fallqvist Magnusson""");

        mainMenu();
    }

    public static void mainMenu() {
        boolean menu = true;

        while (menu) {

            System.out.println("""
                                        
                    Game Menu
                    [1] Upp och Ner
                    [2] Min Max
                    [3] Sten Sax Påse
                    [4] Ordning och reda
                    [E] Avsluta""");

            menu = isMenu();
        }
    }

    private static boolean isMenu() {
        String menuChoice = scanner.nextLine().toUpperCase();

        switch (menuChoice) {
            case "1" -> UppOchNer.uppOchNer();
            case "2" -> MinMax.minMax();
            case "3" -> StenSaxPase.stenSaxPase();
            case "4" -> OrdningOchReda.ordningOchReda();
            case "E" -> {
                System.out.println("""
                                                
                        Program ending...""");
                return false;
            }
            default -> {
                System.out.println("""
                                
                        Invalid input...
                        Try again!""");
                return true;
            }
        }
        return false;
    }
}

