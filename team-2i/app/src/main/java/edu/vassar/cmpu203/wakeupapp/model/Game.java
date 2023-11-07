package edu.vassar.cmpu203.wakeupapp.model;

public class Game{
    private boolean isWinner;
    private int reward;
    private boolean alarmOn;

    protected void setDefault(){
        this.isWinner = false;
        this.alarmOn = false;
    }
    protected void activateAlarm(){this.alarmOn = true;}
    protected void deactivateAlarm(){this.alarmOn = false;}

    protected int give_award(){return this.reward;}

    public void playGame(boolean activeAlarm){

    }
}
