package com.brc.race.classes;

public class Track {
    private String[] track = new String[71];
    private final String fillCharacter = "";
    
    public Track() {
        for (int i = 1; i < track.length; i++) {
            track[i] = fillCharacter;
        }
    }

    public void showInTerminal() {
        System.out.print("INICIO [ ");
        for (int i = 1; i < track.length; i++) {
            System.out.printf("%s ", track[i]);
        }
        System.out.print("] CHEGADA \n");
    }
    
    public void update(Competitor competitor, int position) {
        track[position] = competitor.symbol;
    }
    

    public void remove(Competitor competitor) {
        if (competitor.currentPos > 0 && competitor.currentPos < 70) {
            track[competitor.currentPos] = fillCharacter;
        }
        else {
            track[1] = fillCharacter;
        }
    }

}