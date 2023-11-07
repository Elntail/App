package edu.vassar.cmpu203.wakeupapp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Dictionary {

    //String word, String definition, String theme
    private List<Word> words; //default word array
    private Queue<String> curBank; //saves a current word bank based on a given parameter

    private int targetLen;

    private String targetTheme;

    public Dictionary(){
        words = new ArrayList<Word>();
        curBank = new LinkedList<String>();
        // testing word bank, other variables for future implementation

        words.add(new Word("abate","",""));
        words.add(new Word("aback","",""));
        words.add(new Word("abase","",""));
        words.add(new Word("scrap","",""));
        words.add(new Word("dog","",""));
        words.add(new Word("sprinkles","",""));


    }



    /**
     * Adds all words into the word bank based on a set length
     * @return if any word is added to the bank
     */
    private boolean setBankLength(List<Word> bank){
        for(Word s : bank){
            if(s.samelength(targetLen)){
                curBank.add(s.getWord());
            }
        }
        return curBank.size() > 0;
    }

    /**
     * Adds all words into the word bank based on a set length
     * @return if any word is added to the bank
     */
    private boolean setBankTheme(List<Word> bank){
        for(Word s : words){
            if(s.sameTheme(targetTheme)){
                curBank.add(s.getWord());
            }
        }
        return curBank.size() > 0;
    }

    /**
     * Adds all words into word bank based on a set length and theme
     * @return
     */
    private boolean setBankLT(List<Word> bank){
        for(Word s : words){
            if(s.sameTheme(targetTheme) && s.samelength(targetLen)){
                curBank.add(s.getWord());
            }
        }
        return curBank.size() > 0;

    }



    /**
     * Returns a word from the current word bank and remove from the queue.
     * @return word if available or null if it is empty
     */
    public String getWord() {

        // temporary code
        return words.remove(0).getWord();
    }

    /**
     * Builds a dictionary based on the set parameters of len and theme
     */
    public void buildBank(){

        // shuffles the words arraylist for randomness
        // does not modify the original words ArrayList

        List<Word> temp = new ArrayList<Word>(words);

        Collections.shuffle(temp);

        if(targetLen != 0 && !targetTheme.isEmpty()){setBankTheme(temp);}
        else if(targetTheme.isEmpty()){setBankLength(temp);}
        else{setBankTheme(temp);}

    }


    public void setTargetLen(int len){targetLen = len;}

    public void setTargetTheme(String theme){this.targetTheme = theme;}


}







