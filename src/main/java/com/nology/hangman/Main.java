package com.nology.hangman;

import java.util.Arrays;

public class Main {

    //Grab needed other classes.

    public static void main(String[] args) {

        //Main executor, handles game initialisation and replay.
        //focus on a single game for now.

        Game game = new Game();
        String currentLetter = "";

        game.init();

        while (game.lives != 0 || !Arrays.asList(game.guessedLetters.split("")).containsAll(Arrays.asList(game.currentWord.split("")))) {
            game.state();
            currentLetter = Input.getUserInput();
            if (!Arrays.asList(game.guessedLetters.split("")).contains(currentLetter)) {
                System.out.println("you guessed " + currentLetter);
                game.guessedLetters = game.guessedLetters + currentLetter;
                if ( !Arrays.asList(game.currentWord.split("")).contains(currentLetter) ) {
                    game.lives --;
                }
            } else {
                System.out.println("You already guessed that, try again");
            }
            //debug:
            System.out.println(game.guessedLetters.split(""));
            System.out.println(game.currentWord.split(""));
        }

    }
}
