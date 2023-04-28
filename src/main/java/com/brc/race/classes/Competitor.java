package com.brc.race.classes;

public class Competitor {
    protected Track track = new Track();
    protected final String symbol;
    protected int currentPos;
    protected boolean won = false;

    public Competitor(String symbol) {
        this.symbol = symbol;
        this.currentPos = 1;
        track.update(this, currentPos);
    }

    public void move(int movement) {
        track.remove(this);
        int temp = Moves.getTypeMovement(symbol, movement);
        if (currentPos + temp > 0) {
            currentPos += temp;
        }
        //currentPos += Moves.getTypeMovement(symbol, movement);
        
        if (currentPos > 0 && currentPos < 70) {
            track.update(this, currentPos);
        }
        if (currentPos >= 70) {
            won = true;
            track.update(this, 70);
        }
    }


}