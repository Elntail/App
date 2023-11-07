package edu.vassar.cmpu203.wakeupapp.view;

import android.view.View;

import androidx.annotation.NonNull;

import edu.vassar.cmpu203.wakeupapp.model.Hangman;

/**
 * Interface that defines the methods for a view that allows a user to play Hangman.
 */

public interface IHangmanView {


    /**
     * Interface that classes interested in being notified of events happening
     * to the view should implement.
     */
    interface Listener {

        /**
         * Called when an item is to be added onto the sale.
         *
         * @param guess letter or word that a player would attempt to input

         */
        void onAddedGuess(@NonNull String guess);

        void toMainMenu();

}

    /**
     * Returns the view at the root of the screen's graphical component hierarchy.
     *
     * @return the view at the root of the screen's graphical component hierarchy.
     */
    View getRootView();

    /**
     * Has the view update its display and show the line items of the sale passed in as an argument.
     *
     * @param guesses the guess to be displayed
     */


    /**
     * Updates the picture to current state of counter, less the counter, the
     * more body parts displayed in the picture
     *
     * @param game the current instance of the hangman game
     */
    void updateSteve(Hangman game);

    /**
     * Updates the text box "player_answer" to display the current state of
     * the player's answer
     *
     * @param game the current instance of the hangman game
     */
    void updatePlayerAnswer(Hangman game);

    /**
     * Displays a message that tells the player that their input is correct
     *
     */
    void correctInput();

    /**
     * Displays a message that tells the player that the input is incorrect
     *
     */
    void incorrectInput();

    /**
     * Displays a message that tells the player that the word input is not
     * the same size length as the answer length
     *
     */
    void invalidWordLength();

    void noChange();

    void setUsedLet(Hangman game);


}
