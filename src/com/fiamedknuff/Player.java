package com.fiamedknuff;

import java.util.Collection;

public class Player {
    private Ludo.Team lag;

    public Player(Ludo.Team lag) {
        this.lag = lag;
    }

    public int slå() {
        return Dice.getInstance().dieThrow();
    }

    private void gå() {

    }

    private void knuff(Collection<Piece> pjäser) {

    }


}
