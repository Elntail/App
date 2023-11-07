package edu.vassar.cmpu203.wakeupapp.view;

import android.view.View;

import androidx.annotation.NonNull;

public interface ISelectionFragment {

    /**
     * Interface that classes interested in being notified of events happening
     * to the view should implement.
     */


    interface Listener {
        /**
         * Called when name is added by user.
         * Starts an instance of the hangman game
         *
         * @param
         */
        void startHangman();

        void startPet();


    }

    /**
     * Retrieve the graphical widget (android view) at the root of the screen hierarchy/
     * @return the screen's root android view (widget)
     */
    View getRootView();


}



