package com.fiamedknuff;

public class Pjäs {
    private Spelplan.Lag färg;
    private boolean isInNest;
    private boolean isOutOfGame;

    public Pjäs(Spelplan.Lag färg) {
        this.färg = färg;
        isInNest = true;
        isOutOfGame = false;
    }

    public Spelplan.Lag getFärg() {
        return färg;
    }

    public boolean isInNest() {
        return isInNest;
    }

    public boolean isOutOfGame() {
        return isOutOfGame;
    }

}
