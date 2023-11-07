package edu.vassar.cmpu203.wakeupapp.view;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.vassar.cmpu203.wakeupapp.R;
import edu.vassar.cmpu203.wakeupapp.databinding.FragmentPetBinding;
import edu.vassar.cmpu203.wakeupapp.databinding.HangmanGameBinding;
import edu.vassar.cmpu203.wakeupapp.model.Hangman;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class HangmanFragment extends Fragment implements IHangmanView{

    private HangmanGameBinding binding; // reference to graphical widgets from xml layout

    private IHangmanView.Listener listener;




    public HangmanFragment(IHangmanView.Listener listener) {
        this.listener = listener;
    }
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        this.binding = HangmanGameBinding.inflate(inflater);
        return this.binding.getRoot(); // return top level view
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        //this.listener.toGameMenu();
        // getMainView.getRootView();
        this.binding.exitButton.setOnClickListener(new View.OnClickListener() {
            @Override

            // gets username from the text box
            public void onClick(View view) {
                listener.toMainMenu();
            }
        });

        // gets guess from the text box
        this.binding.submitGuess.setOnClickListener(view2 -> {
            Editable text = this.binding.guess.getText();
            String guess = text.toString();
            text.clear();

            listener.onAddedGuess(guess);
        });
    }

    public View getRootView() {
        return binding.getRoot();
    }


    @Override
    public void updateSteve(Hangman game) {

        switch (game.Counter()) {
            case 5:
                this.binding.gallows.setImageResource(R.drawable.hangman_second);
                break;
            case 4:
                this.binding.gallows.setImageResource(R.drawable.hangman_body_copy);
                break;
            case 3:
                this.binding.gallows.setImageResource(R.drawable.hang_foot_one);
                break;
            case 2:
                this.binding.gallows.setImageResource(R.drawable.tumblr_inline_pg0k73u7bj1rh6ctt_500_2);
                break;
            case 1:
                this.binding.gallows.setImageResource(R.drawable.tumblr_inline_pg0k73u7bj1rh6ctt_500_3);
                break;
        }

    }

    @Override
    public void updatePlayerAnswer(Hangman game) {
        this.binding.playerAnswer.setText(game.getPlayerAns());
    }
    @Override
    public void setUsedLet(Hangman game){
        this.binding.usedBox.setText(game.getUsedLet() + game.getWords());
    }


    @Override
    public void correctInput() {
        String text = "That is a correct letter.";

        this.binding.InputMessage.setText(text);

    }

    @Override
    public void incorrectInput() {
        String text = "That is an incorrect input.";
        this.binding.InputMessage.setText(text);


    }

    @Override
    public void invalidWordLength() {
        String text = "That doesn't match the length of the answer.";
        this.binding.InputMessage.setText(text);


    }

    @Override
    public void noChange(){
        String text = "Word/Letter have already been used.";
        this.binding.InputMessage.setText(text);

        //   @Override
        //   public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        //        this.binding.exitButton.setOnClickListener(new View.OnClickListener() {
        //            @Override
        // Starts hangman
        //            public void onClick(View view) {
        //            PetFragment.this.listener.startHangman();
        //        }
        //          });
        //     }
    }

}
