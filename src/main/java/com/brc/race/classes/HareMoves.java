package com.brc.race.classes;

public enum HareMoves {
    SLEEP(20, 0),
    BIG_HEEL(20, 9),
    BIG_SLIDE(10, -12),
    SHORT_HEEL(30, 1),
    SHORT_SLIDE(20, -2);

    final int TIME_PERCENTAGE;
    final int MOVE_VALUE;

    HareMoves(int timePercentage, int realMove) {
        this.TIME_PERCENTAGE = timePercentage;
        this.MOVE_VALUE = realMove;
    }
}
