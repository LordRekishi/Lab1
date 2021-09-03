package se.iths.java21.patrik.lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                                 
                Welcome to Lab 1
                Presented by: Patrik Fallqvist Magnusson""");

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
        boolean menu = true;

        String menuChoice = scanner.nextLine().toUpperCase();

        switch (menuChoice) {
            case "1" -> UppOchNer.uppOchNer();
            case "2" -> MinMax.minMax();
            case "3" -> StenSaxPase.stenSaxPase();
            case "4" -> OrdningOchReda.ordningOchReda();
            case "E" -> {
                System.out.println("""
                        
                        Program ending...""");
                menu = false;
                return menu;
            }
        }
        System.out.println("""
        
        Invalid input...
        Try again!""");
        return menu;
    }
}
