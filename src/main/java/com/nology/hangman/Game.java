package com.nology.hangman;

public class Game {

    //Handles game logic.

    String guessedLetters;
    int lives;
    String currentWord = Storage.getRandomWord();

    public void init() {
        guessedLetters = "";
        lives = 5;
    }

    public void state() {
        //returns game's state

        //word
        System.out.println(Output.obfuscateWord(currentWord, guessedLetters));

        //lives
        Output.lifeCount(lives);

        //input prompt.
        System.out.println("Enter guess:");
    }

}
