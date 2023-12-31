package edu.vassar.cmpu203.wakeupapp.view;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import edu.vassar.cmpu203.wakeupapp.databinding.MainLayoutBinding;


//completed
public class MainView implements IMainView{

    String name;

    FragmentManager fmanager; // lets us perform fragment transactions
    MainLayoutBinding binding;  // gives us access to all the graphical components in res/layout/main.xml

    /**
     * Constructor method.
     * @param activity The android activity the screen is associated with.
     */
    public MainView(FragmentActivity activity) {
        this.fmanager = activity.getSupportFragmentManager();
        this.binding = MainLayoutBinding.inflate(activity.getLayoutInflater());

    }

    /**
     * Retrieve the graphical widget (android view) at the root of the screen hierarchy/
     * @return the screen's root android view (widget)
     */
    @Override

    public View getRootView() {
        return this.binding.getRoot();
    }

    /**
     * Replaces the contents of the screen's fragment container with the one passed in as an argument.
     *
     * @param fragment The fragment to be displayed.
     * @param reversible true if this transaction should be reversible, false otherwise
     * @param name the name this transaction can be referred by.
     */
    @Override
    public void displayFragment(Fragment fragment, boolean reversible, String name) {
        FragmentTransaction ft = fmanager.beginTransaction().replace(this.binding.appSystem.getId(), fragment);
        if (reversible) ft.addToBackStack(name);
        ft.commit(); // execute transaction
    }

    /**
     * Sets current name of player to input
     *
     * @param name Username of the player
     */

    public void setName(@NonNull String name){
        this.name = name;

        String text = "Current player :" + name;

        this.binding.currentPlayer.setText(text);
    }

}