package com.fiamedknuff;

import java.util.Collection;

public class Piece {
    private Ludo.Team lag;
    private boolean isInNest;
    private boolean isOutOfGame;

    public Piece(Ludo.Team lag) {
        this.lag = lag;
        isInNest = true;
        isOutOfGame = false;
    }

    public Ludo.Team getLag() {
        return lag;
    }

    public boolean isInNest() {
        return isInNest;
    }

    public boolean isOutOfGame() {
        return isOutOfGame;
    }

    public void putBackInNest(Collection<Piece> pjäser) {
        Ludo.getInstance().putInNest(pjäser, getLag());
        isInNest = true;

    }
}
