package com.fiamedknuff;

import java.util.Collection;

public class Player {
    private Ludo.Color lag;

    public Player(Ludo.Color lag) {
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
