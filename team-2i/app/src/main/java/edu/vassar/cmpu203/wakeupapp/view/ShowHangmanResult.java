package edu.vassar.cmpu203.wakeupapp.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import edu.vassar.cmpu203.wakeupapp.R;
import edu.vassar.cmpu203.wakeupapp.databinding.ShowGameResultBinding;
import edu.vassar.cmpu203.wakeupapp.model.Hangman;

public class ShowHangmanResult implements IShowHangmanResult{


    private ShowGameResultBinding binding;

    private IShowHangmanResult.Listener listener;


    public ShowHangmanResult(Context context, IShowHangmanResult.Listener listener) {

        this.listener = listener;

        this.binding = ShowGameResultBinding.inflate(LayoutInflater.from(context));

        // gets guess from the text box
        this.binding.exitButton.setOnClickListener(view -> {
           // getMainView.getRootView();


           this.listener.toMainMenu();

        });
    }

    @Override
    public View getRootView() {
        return binding.getRoot();
    }

    @Override
    public void setLoser(Hangman steve) {
        String text = "Steve is dead. U suck...";
        String answer = "The answer was " + steve.getAnswer();

        this.binding.displayResult.setImageResource(R.drawable.dead_man);
        this.binding.gameResultMessage.setText(text);
        this.binding.answer.setText(answer);


    }

    @Override
    public void setVictor(Hangman steve) {
        String text = "Steve isn't dead. Imagine if he died. Would've been cringe...";
        String answer = "The answer was " + steve.getAnswer();


        this.binding.displayResult.setImageResource(R.drawable.yay_man);
        this.binding.gameResultMessage.setText(text);
        this.binding.answer.setText(answer);


    }

}
