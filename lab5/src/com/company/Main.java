package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String loop = "yes";
        int newCount = 0;
        int userInput = instructions();         // Prompting the user to pick their die size.


        while (loop.equals("yes")) {
            int die1 = die1(userInput);
            int die2 = die2(userInput);             // Init the methods and printing the results.
            newCount = rollNumber(newCount);
            System.out.printf("Roll " + newCount + "\n" + die1 + "\n" + die2);
            System.out.println();
            result(die1,die2);
            System.out.println("\nRoll again? (yes/no)");
            loop = scnr.nextLine();
            System.out.println();
        }

    }

    private static int instructions() {
        Scanner scnr = new Scanner(System.in);
        int input;
        System.out.println("Welcome to the grand circus casino!");
        System.out.println("how many sides should each die have:");
        input = scnr.nextInt();
        return input;
    }

    private static int die1(int userinput) {            // Random number generator die 1 and 2.

        return (int) (Math.random() * userinput + 1);
    }

    private static int die2(int userinput) {

        return (int) (Math.random() * userinput + 1);
    }

    private static int rollNumber(int oldCount) {       // Roll counter

        return oldCount + 1;
    }
    private static void result(int die1, int die2){     // Checking if results match snake eyes or doubles.

        if (die1 == die2 && die1 == 1){
            System.out.println("Snake eyes!");

        }else if (die1 == die2){
            System.out.println("Doubles!");
        }

    }
}
