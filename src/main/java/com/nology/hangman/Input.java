package com.nology.hangman;

import java.util.List;
import java.util.Scanner;

public class Input {

    static Scanner userInput = new Scanner(System.in);

    static String getUserInput(int limit) {
        String rawInput = "";

        while (rawInput.equals("")) {
            rawInput = userInput.nextLine();
            if (rawInput.equals("")) {
                System.out.println("Error: Please enter at least " + limit + " character(s)");
            }
        }
        limit = Math.min(limit, rawInput.length());
        String cookedInput = rawInput.toLowerCase().substring(0, limit);
        return cookedInput;
    }
    static String getUserInput() {
        return getUserInput(1);
    }
}
