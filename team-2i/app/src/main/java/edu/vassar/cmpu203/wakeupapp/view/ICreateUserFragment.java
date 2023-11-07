package edu.vassar.cmpu203.wakeupapp.view;

import android.view.View;

public interface ICreateUserFragment {
    /**
     * Interface that classes interested in being notified of events happening
     * to the view should implement.
     */


    interface Listener {
        /**
         * Called when name is added by user.
         * Send the name to the main view to show current user
         *
         * @param name Name of User
         */
        void getUserInfo(String name);



    }



    /**
     * Retrieve the graphical widget (android view) at the root of the screen hierarchy/
     * @return the screen's root android view (widget)
     */
    View getRootView();



}
