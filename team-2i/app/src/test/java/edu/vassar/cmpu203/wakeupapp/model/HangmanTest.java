package edu.vassar.cmpu203.wakeupapp.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HangmanTest {

    /**
     * Testing Counter is incrementing correctly
     */
    @Test
    public void testCounter() {

        String s = "";

        // create an empty Hangman game to work with
        Hangman steve = new Hangman(s);

        //Test inital value of 6
        assertEquals(6, steve.Counter());

        //Increment Counter by 2
        steve.updateSteve();
        steve.updateSteve();

        //Test inital value of 4
        assertEquals(4, steve.Counter());
    }
    /**
     * Testing if word is added to used word bank
     * */
    @Test
    void containsWord() {
        // create an empty Hangman game to work with
        String s = "";
        Hangman steve = new Hangman(s);

        // adds thomas to used word bank
        steve.addWord("Thomas");

        assertEquals(true, steve.containsWord("Thomas"));
        assertEquals(false, steve.containsWord("Micheal"));

    }

    /**
     * Testing if letter is removed from the available letter list
     */
    @Test
    void removeLet() {

        // create an empty Hangman game to work with
        String s = "";
        Hangman steve = new Hangman(s);

        // Remove 'a' from available letter bank
        steve.modifyPAns("a");

        assertEquals(true, steve.containsLet("b"));
        assertEquals(false, steve.containsWord("a"));
    }

    /**
     * Testing if when given a correct letter in answer, that the player's
     * current answer is also changed
     */
    @Test
    void changedPAns() {

        // create a Hangman game to work with
        String s = "abbbc";
        Hangman steve = new Hangman(s);

        // Remove 'a' from available letter bank
        steve.modifyPAns("a");

        assertEquals("a _ _ _ _ ", steve.getPlayerAns());

        steve.modifyPAns("d");


        assertEquals("a _ _ _ _ ", steve.getPlayerAns());
    }

}