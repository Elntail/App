package edu.vassar.cmpu203.wakeupapp.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.vassar.cmpu203.wakeupapp.databinding.FragmentCreateUserBinding;


public class CreateUserFragment extends Fragment implements ICreateUserFragment{

    private FragmentCreateUserBinding binding; // reference to graphical widgets from xml layout
    private final ICreateUserFragment.Listener listener; // observer to be notified of events of interest

    /**
     * Constructor method.
     *
     * @param listener observer to be notified of events of interest
     */
    public CreateUserFragment(ICreateUserFragment.Listener listener) {
        this.listener = listener;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        this.binding = FragmentCreateUserBinding.inflate(inflater);
        return this.binding.getRoot(); // return top level view
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        this.binding.submitUserInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            // Starts hangman
            public void onClick(View view) {
                Editable text = binding.UsernameBox.getText();
                String name = text.toString();
                text.clear();

                if(!name.isEmpty()){
                    listener.getUserInfo(name);
                }
                else{
                    String message = "You need to put in an name. Like anything would be fine, like Bagels or Godzilla or whatever.";
                    binding.nameErrorBox.setText(message);
                }

            }


        });


    }

    @Override
    public View getRootView() {
        return binding.getRoot();
    }




}