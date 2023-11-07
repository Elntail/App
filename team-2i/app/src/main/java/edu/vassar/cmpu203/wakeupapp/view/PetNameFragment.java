package edu.vassar.cmpu203.wakeupapp.view;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import edu.vassar.cmpu203.wakeupapp.R;
import edu.vassar.cmpu203.wakeupapp.databinding.FragmentPetNameBinding;
import edu.vassar.cmpu203.wakeupapp.databinding.FragmentSelectionBinding;
import kotlinx.coroutines.ObsoleteCoroutinesApi;


public class PetNameFragment extends Fragment implements IPetNameFragment{

    private FragmentPetNameBinding binding; // reference to graphical widgets from xml layout

    private IPetNameFragment.Listener listener;


    /**
     * Constructor method.
     *
     * @param listener observer to be notified of events of interest
     */
    public PetNameFragment(IPetNameFragment.Listener listener) {
        this.listener = listener;
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        this.binding = FragmentPetNameBinding.inflate(inflater);
        return this.binding.getRoot(); // return top level view
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        this.binding.addNameButton.setOnClickListener(new View.OnClickListener() {
            @Override

            // gets username from the text box
            public void onClick(View view) {
                Editable text = binding.inputUsername.getText();
                String name = text.toString();
                text.clear();


                if(!name.isEmpty()){
                    listener.setPetName(name);
                }
                else{
                    String message = "You need to put in an name. Like anything would be fine, like Bagels or Godzilla or whatever.";
                    binding.petNameError.setText(message);
                }

            }



        });

    }



    @Override
    public View getRootView(){return binding.getRoot();}


}