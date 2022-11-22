package com.nology.hangman;

import javax.swing.*;
import java.util.Random;

public class Storage {

    static String[] wordlist = {
            "alpha",
            "bravo",
            "charlie",
            "delta",
            "echo"
    };
    String validLetters = "abcdefghijklmnopqrstuvwxyz";

    static String getRandomWord() {
        Random rand = new Random();
        return wordlist[rand.nextInt(wordlist.length)];
    }
}
