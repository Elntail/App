package edu.vassar.cmpu203.wakeupapp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.List;

public class Hangman {
    private final String answer;
    private int counter = 6;
    private Guesses guessed; //>>TODO:add a method "addGuess" instead of making public so u don't expose the internals
    private String steve; // ask if we need to add steve to glossary?
    private String playerAns = "";


    public Hangman(String answer) {
        this.answer = answer.toLowerCase();
        this.guessed = new Guesses();

        for (int i = 0; i < answer.length(); i++) {
            this.playerAns += "_";
        }
    }

    private class Guesses {
        final String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        List<String> words; // saves used words of player
        List<String> availLet; //saves available letters
        List<String> usedLet; //saves used letters of player

        public Guesses() {
            availLet = new ArrayList<>(26);
            availLet.addAll(Arrays.asList(letters));

            words = new ArrayList<>(6);
            usedLet = new ArrayList<>(6);


        }

        public Guesses addGuess() {
            return guessed;
        }

        /*

            If letter is not already used, then remove from list of available letters and add
            to usedLet arraylist
            @return if letter is added to usedLetter list
         */
        void removeLet(char letter) {
            String let = letter + "";
            if (!usedLet.contains(let)) {
                availLet.remove(let);
                usedLet.add(let);
            }
        }

    }
    /*
       Returns current state of steve
       @return String of remaining body parts
    */


    /**
     * Returns the current value of counter
     *
     * @return Current value of Counter variable
     */
    public int Counter() {
        return this.counter;
    }

    /**
     * Returns the toString of the Used Word Bank
     *
     * @return words.toString()
     */
    public String getWords() {
        return guessed.words.toString();
    }

    /**
     * Returns the toString of the Used Let Bank
     *
     * @return usedLet.toString()
     */
    public String getUsedLet() {
        return guessed.usedLet.toString();
    }

    /**
     * Returns the answer to the hangman game
     *
     * @return answer
     */
    public String getAnswer() {
        return this.answer;
    }


    /**
     * Returns the current state of the player answer as a String
     *
     * @return String format of the current state of the player's answer
     */
    public String getPlayerAns() {
        String retStr = "";

        for (char i : playerAns.toCharArray())
            retStr += i + " ";
        return retStr;
    }

    /**
     * Returns whether the word have already been used by the player
     *
     * @param word Player's guessed word
     * @return if word have already been used
     */
    public boolean containsWord(String word) {
        return guessed.words.contains(word);
    }

    /**
     * Returns whether the letter have already been used by the player
     *
     * @param let Player's guessed word
     * @return if letter have already been used
     */
    public boolean containsLet(String let) {
        return guessed.availLet.contains(let);
    }

    /**
     * Adds word to used word bank
     *
     * @param word
     */
    public void addWord(String word) {
        guessed.words.add(word);
    }

    /**
     * Decrease the counter by 1
     */
    public void updateSteve() {
        counter--;
    }

    /**
     * Takes in a letter and attempts to replace all instances of the player answer
     * if it matches the same position in the answer.
     *
     * @param guessed Player's guessed letter
     * @return if it changed the player's answer
     */

    public boolean modifyPAns(String guessed) {
        boolean change = false;
        for (int i = 0; i < answer.length(); i++) {
            if (playerAns.charAt(i) == '_' && guessed.charAt(0) == answer.charAt(i)) {
                StringBuilder sb = new StringBuilder(playerAns);
                sb.setCharAt(i, answer.charAt(i));
                playerAns = sb.toString();
                change = true;
            }
        }
        this.guessed.removeLet(guessed.charAt(0));

        return change;

    }

    public String examineGuess(String guessed) {
        System.out.println("Answer =" + answer);

        // checks if input > 1 and
        // if correct then end game
        if (guessed.length() > 1 && !this.containsWord(guessed)) {

            // checks if player answer is equal to answer
            if (guessed.equals(this.getAnswer())) {
                return "winner";
            }
            // returns that the word is incorrect, adding to used word bank
            // and updating the model
            else if (guessed.length() == answer.length()){
                this.addWord(guessed);
                this.updateSteve();
                // Ends game if counter == 0
                if (this.Counter() < 1) {
                    return "loser";
                }
                return "incorrect word";
            }
            //if input != answer.length && input.length() > 1
            else{
                return "bad word length";
            }

        }
        //if letter then check if letter is in word
        else if (guessed.length() == 1 && this.containsLet(guessed)) {

            boolean change = this.modifyPAns(guessed);
            if (change) {
                if (this.playerAns.equals(this.getAnswer())) {
                    return "winner";
                } else if (this.playerAns.contains("_")) {
                    return "correct let";

                }
            } else {
                this.guessed.removeLet(guessed.charAt(0));
                this.updateSteve();

                // Ends game if counter == 0
                if (this.Counter() < 1) {
                    return "loser";
                }
                return "incorrect let";
            }
        }
        // return that input is invalid and DO NOT increment the counter
        return "invalid input";

    }



}


