package edu.vassar.cmpu203.wakeupapp.view;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import android.view.View;
import android.view.ViewGroup;

import edu.vassar.cmpu203.wakeupapp.R;


import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;

import edu.vassar.cmpu203.wakeupapp.R;
import edu.vassar.cmpu203.wakeupapp.databinding.FragmentPetBinding;

import edu.vassar.cmpu203.wakeupapp.databinding.FragmentPetNameBinding;
import edu.vassar.cmpu203.wakeupapp.model.Hangman;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import edu.vassar.cmpu203.wakeupapp.databinding.MainLayoutBinding;
import edu.vassar.cmpu203.wakeupapp.model.Pet;


public class PetFragment extends Fragment implements IPetFragment {

    private FragmentPetBinding binding;

    private IPetFragment.Listener listener;

    public PetFragment(Context context, IPetFragment.Listener listener, String name) {

        this.listener = listener;

        this.binding = FragmentPetBinding.inflate(LayoutInflater.from(context));

        this.setText(name);
    }


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        this.binding = FragmentPetBinding.inflate(inflater);
        this.setText("helow");
        return this.binding.getRoot(); // return top level view

    }


    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        //this.listener.toGameMenu();
        // getMainView.getRootView();
        this.binding.homeButton.setOnClickListener(new View.OnClickListener() {
            @Override

            // gets username from the text box
            public void onClick(View view) {
        listener.gameMenu();
            }
        });
    }

    public void setText(String name){
        this.binding.nameBox.setText("hellow");
    }

    @Override
    public View getRootView() {
        return binding.getRoot();
    }


}