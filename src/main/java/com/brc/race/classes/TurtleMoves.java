package com.brc.race.classes;

public enum TurtleMoves {
    FAST_WALK(50, 3),
    SLIDE(20, -6),
    SLOW_WALK(30, 1);

    final int TIME_PERCENTAGE;
    final int MOVE_VALUE;

    TurtleMoves(final int timePercentage, final int realMove) {
        this.TIME_PERCENTAGE = timePercentage;
        this.MOVE_VALUE = realMove;
    }

}
