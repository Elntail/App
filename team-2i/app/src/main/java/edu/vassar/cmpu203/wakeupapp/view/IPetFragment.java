package edu.vassar.cmpu203.wakeupapp.view;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public interface IPetFragment {
    /**
     * Interface that classes interested in being notified of events happening
     * to the view should implement.
     */
    interface Listener {
        void gameMenu();

    }


    /**
     * Retrieve the graphical widget (android view) at the root of the screen hierarchy/
     * @return the screen's root android view (widget)
     */
    View getRootView();

}
