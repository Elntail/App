package edu.vassar.cmpu203.wakeupapp.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import edu.vassar.cmpu203.wakeupapp.model.Dictionary;
import edu.vassar.cmpu203.wakeupapp.model.Graveyard;
import edu.vassar.cmpu203.wakeupapp.model.Hangman;
import edu.vassar.cmpu203.wakeupapp.view.CreateUserFragment;
import edu.vassar.cmpu203.wakeupapp.view.HangmanFragment;
import edu.vassar.cmpu203.wakeupapp.view.ICreateUserFragment;
import edu.vassar.cmpu203.wakeupapp.view.IHangmanView;
import edu.vassar.cmpu203.wakeupapp.view.IMainView;
import edu.vassar.cmpu203.wakeupapp.view.ISelectionFragment;
import edu.vassar.cmpu203.wakeupapp.view.IShowHangmanResult;
import edu.vassar.cmpu203.wakeupapp.view.MainView;
import edu.vassar.cmpu203.wakeupapp.view.NextGenPosFragFactory;
import edu.vassar.cmpu203.wakeupapp.view.PetFragment;
import edu.vassar.cmpu203.wakeupapp.view.PetNameFragment;
import edu.vassar.cmpu203.wakeupapp.view.SelectionFragment;
import edu.vassar.cmpu203.wakeupapp.view.ShowHangmanResult;
import edu.vassar.cmpu203.wakeupapp.view.IPetFragment;
import edu.vassar.cmpu203.wakeupapp.view.IPetNameFragment;


public class MainActivity extends AppCompatActivity implements ISelectionFragment.Listener, IHangmanView.Listener, IShowHangmanResult.Listener, IPetFragment.Listener, IPetNameFragment.Listener, ICreateUserFragment.Listener {

    private IShowHangmanResult getResultView;

    private Hangman hangman; // Ref to hangman object

    private Dictionary dict; // Ref to dictionary object

    private IMainView mainView; // A reference to the main screen template

    private IHangmanView hangmanView;// A reference to the hangman template

    private IPetFragment petView;

    private IPetNameFragment petNameView;

    private Graveyard graveyard;


    /**
     * Creates a new instance of the WAKEUP app, i.e App startup.
     * Basically the WAKEUP app's main method
     *
     * @param savedInstanceState saved data from prior instantiation (ignore for now)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // set the fragment factory
        getSupportFragmentManager().setFragmentFactory(new NextGenPosFragFactory(this));

        // this will recreate any fragments that were there before
        // it's therefore important for the fragment factory to be set prior to this call
        super.onCreate(savedInstanceState);

        // create the main view class
        this.mainView = new MainView(this);

        this.hangmanView = new HangmanFragment(this);

        this.petNameView = new PetNameFragment(this);

        this.getResultView = new ShowHangmanResult(this, this);

        this.dict = new Dictionary();

        this.setContentView(mainView.getRootView());

        //this.mainView.displayFragment(new CreateUserFragment(this),true, "UserInfo");

        this.startHangman();

    //    if (savedInstanceState == null) {
    //   }



    }


    /*ICreateUserFragment.Listener interface implementation start */

    @Override
    public void getUserInfo(String name){
        this.mainView.setName(name);
   //     this.mainView.displayFragment(new SelectionFragment(this), true, "SelectionFrag");
this.mainView.displayFragment(new PetNameFragment (this), true, "Pet Name");
    }


    /*ICreateUserFragment.Listener interface implementation end */




    /*ISelectionFragment.Listener interface implementation start */

    @Override
    public void startPet(){
      //  this.mainView.displayFragment(new PetNameFragment(this), true, "Pet Name");
        this.mainView.displayFragment(new PetFragment(this, this, "name"), true, "SelectionFrag");
    }

    @Override
    public void gameMenu(){
        this.mainView.displayFragment(new SelectionFragment(this), true, "PetFrag");
    }

    @Override
    public void startHangman() {
        String word = dict.getWord();
        this.hangman = new Hangman(word);

        //switch to hangman view
       this.mainView.displayFragment((HangmanFragment)hangmanView, false, "hangman");

       // hangmanView.updatePlayerAnswer(hangman);

    }
    /*iSelectionFragment.Listener interface implementation end */




    /*IPetNameFragment.Listener interface implementation start */


    @Override
    public void setPetName(String name){
        this.mainView.displayFragment(new PetFragment(this, this, name),true,"PetFrag");

    }

    /*IPetNameFragment.Listener interface implementation end */





//    @Override
//    public void goToGames() {
//
//
//        //switch to hangman view
//        setContentView(mainView.getRootView());
//
//
//    }

    /*IHangmanView.Listener interface implementation start */
    @Override
    public void onAddedGuess(String guessed) {
        String state = hangman.examineGuess(guessed);

        switch(state){
            case "winner" :
                //sets winner
                getResultView.setVictor(hangman);
                setContentView(getResultView.getRootView());
                break;
            case "loser" :
                //sets loser
                getResultView.setLoser(hangman);
                setContentView(getResultView.getRootView());
            case "incorrect let":
                // updates textbox and tell user that their input is incorrect
                hangmanView.updateSteve(hangman);
                hangmanView.incorrectInput();
                break;
            case "correct let":
                // updates textbox and tell user that their let input is correct
                hangmanView.updatePlayerAnswer(hangman);
                hangmanView.correctInput();
                break;
            case "bad word length":
                // tells user that word length is incorrect
                hangmanView.invalidWordLength();
                break;
            case "invalid input":
                hangmanView.noChange();
        }
            hangmanView.setUsedLet(hangman);
    }

    @Override
    public void toMainMenu() {
       // petView.getRootView();
       // this.petView.displayFragment(new SelectionFragment(this), true, "SelectionFrag");
     this.mainView.displayFragment(new PetFragment(this,this,"name"), true, "Pet");
    }
    /*IHangmanView.Listener interface implementation end */
 //   @Override
 //   public void toGameMenu(){
  //      mainView.getRootView();
   //     this.mainView.displayFragment(new SelectionFragment(this), true, "SelectionFrag");

   // }

}
