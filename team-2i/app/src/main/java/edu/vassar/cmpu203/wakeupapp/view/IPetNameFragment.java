package edu.vassar.cmpu203.wakeupapp.view;

import android.view.View;

import androidx.annotation.NonNull;

public interface IPetNameFragment {

    /**
     * Interface that classes interested in being notified of events happening
     * to the view should implement.
     */
    interface Listener {
        /**
         * Called when name is added by user
         *
         * @param name name of user
         */
        void setPetName(@NonNull String name);


    }

    public View getRootView();


}
