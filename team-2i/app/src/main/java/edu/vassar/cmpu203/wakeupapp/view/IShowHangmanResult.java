package edu.vassar.cmpu203.wakeupapp.view;

import android.view.View;

import androidx.annotation.NonNull;

import edu.vassar.cmpu203.wakeupapp.model.Hangman;

public interface IShowHangmanResult {

    /**
     * Interface that classes interested in being notified of events happening
     * to the view should implement.
     */
    interface Listener {
        void toMainMenu();

    }

    /**
     * Retrieve the graphical widget (android view) at the root of the screen hierarchy/
     * @return the screen's root android view (widget)
     */
    View getRootView();


    /**
     * Updates the Game Result screen with the loser message and picture
     * @param steve Current state of hangman
     */
    void setLoser(Hangman steve);

    /**
     * Updates the Game Result screen with the victory message and picture
     * @param steve Current state of hangman
     */
    void setVictor(Hangman steve);


}
