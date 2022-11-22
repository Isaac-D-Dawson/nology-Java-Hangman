package com.nology.hangman;

import java.util.Arrays;

public class Output {

    static void lifeCount(int lives) {
        String lifeDisplay = "Lives:";
        for (int i = 0; i < lives; i++) {
            lifeDisplay = lifeDisplay + " <3";
        }
        System.out.println(lifeDisplay);

    }

    static String obfuscateWord(String word, String playerLetters) {

        String output = "";
        for (String letter : word.split("")) {
            if (Arrays.asList(playerLetters.split("")).contains(letter)) {
                output = output + letter;
            } else {
                output = output + "_";
            }
        }

        return output;
    }
}
