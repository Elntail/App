package edu.vassar.cmpu203.wakeupapp.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.Selection;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;

import edu.vassar.cmpu203.wakeupapp.R;
import edu.vassar.cmpu203.wakeupapp.databinding.FragmentSelectionBinding;


public class SelectionFragment extends Fragment implements ISelectionFragment {


    private FragmentSelectionBinding binding; // reference to graphical widgets from xml layout
    private final Listener listener; // observer to be notified of events of interest

    /**
     * Constructor method.
     *
     * @param listener observer to be notified of events of interest
     */
    public SelectionFragment(Listener listener) {
        this.listener = listener;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        this.binding = FragmentSelectionBinding.inflate(inflater);
        return this.binding.getRoot(); // return top level view
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {


        this.binding.petButton.setOnClickListener(new View.OnClickListener() {
            @Override
            // Starts hangman
            public void onClick(View view) {
                SelectionFragment.this.listener.startPet();
            }
        });

        this.binding.PlayHangmanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            // Starts hangman
            public void onClick(View view) {
                    SelectionFragment.this.listener.startHangman();
            }
        });





    }

    @Override
    public View getRootView() {
        return binding.getRoot();
    }
}