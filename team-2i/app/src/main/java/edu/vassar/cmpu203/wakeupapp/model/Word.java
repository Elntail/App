package edu.vassar.cmpu203.wakeupapp.model;

public class Word{

    private String word;
    private String definition;
    private String theme;

    public Word(String word, String definition, String theme){
        this.word = word;
        this.definition = definition;
        this.theme = theme;
    }

    /**
     * Returns whether the word's theme is the same as the
     * inputed theme.
     * @param theme theme for the word;
     * @return if it matched the inputed theme of the word object
     */
    public boolean sameTheme(String theme){
        return this.theme.equals(theme);
    }

    /**
     * Returns the object's word
     * @return word
     */
    public String getWord(){
        return this.word;
    }

    /**
     * Checks whether the word is the same length and input's length
     * @param len user's suggested length
     * @return if word's length is equal to suggested length
     */
    public boolean samelength(int len){
        return this.word.length() == len;
    }

    /**
     * Returns the definition of the word as a hint to the user.
     * @return word's definition
     */
    public String getDefinition(){
        return this.definition;
    }
}
