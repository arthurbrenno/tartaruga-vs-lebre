package com.brc.race.classes;

public final class Moves {

    //Turtle
    private static final int FAST_WALK = TurtleMoves.FAST_WALK.MOVE_VALUE;
    private static final int SLIDE = TurtleMoves.SLIDE.MOVE_VALUE;
    private static final int SLOW_WALK = TurtleMoves.SLOW_WALK.MOVE_VALUE;
    
    //Hare
    private static final int SLEEP = HareMoves.SLEEP.MOVE_VALUE;
    private static final int BIG_HEEL = HareMoves.BIG_HEEL.MOVE_VALUE;
    private static final int BIG_SLIDE = HareMoves.BIG_SLIDE.MOVE_VALUE;
    private static final int SHORT_HEEL = HareMoves.SHORT_HEEL.MOVE_VALUE;
    private static final int SHORT_SLIDE = HareMoves.SHORT_SLIDE.MOVE_VALUE;

    protected static int[] t = {
        -99, 
        FAST_WALK, 
        FAST_WALK, 
        FAST_WALK, 
        FAST_WALK, 
        FAST_WALK, 
        SLIDE, 
        SLIDE,
        SLOW_WALK,
        SLOW_WALK,
        SLOW_WALK
    };

    protected static int[] h = {
        -99, 
        SLEEP, 
        SLEEP, 
        BIG_HEEL, 
        BIG_HEEL, 
        BIG_SLIDE, 
        SHORT_HEEL, 
        SHORT_HEEL, 
        SHORT_HEEL, 
        SHORT_SLIDE, 
        SHORT_SLIDE
    };

    public static int getTypeMovement(String symbol, int movement) {
        if (symbol.equals("T")) {
            return t[movement];
        }
        return h[movement];
    }
}
