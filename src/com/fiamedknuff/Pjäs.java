package com.fiamedknuff;

import java.util.Collection;

public class Pjäs {
    private Spelplan.Lag lag;
    private boolean isInNest;
    private boolean isOutOfGame;

    public Pjäs(Spelplan.Lag lag) {
        this.lag = lag;
        isInNest = true;
        isOutOfGame = false;
    }

    public Spelplan.Lag getLag() {
        return lag;
    }

    public boolean isInNest() {
        return isInNest;
    }

    public boolean isOutOfGame() {
        return isOutOfGame;
    }

    public void putBackInNest(Collection<Pjäs> pjäser) {
        Spelplan.getInstance().putInNest(pjäser, getLag());
        isInNest = true;

    }
}
