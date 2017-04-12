package com.fiamedknuff;

import java.util.Collection;

public class Player {
    private Spelplan.Lag lag;

    public Player(Spelplan.Lag lag) {
        this.lag = lag;
    }

    public int slå() {
        return Dice.getInstance().kasta();
    }

    private void gå() {

    }

    private void knuff(Collection<Pjäs> pjäser) {

    }
}
