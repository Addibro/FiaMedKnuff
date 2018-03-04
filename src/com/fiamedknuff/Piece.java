package com.fiamedknuff;

import java.util.Collection;

public class Piece {
    private Ludo.Color team;
    private boolean isInNest;
    private boolean isOutOfGame;

    Piece(Ludo.Color team) {
        this.team= team;
        isInNest = true;
        isOutOfGame = false;
    }

    Ludo.Color getLag() {
        return team;
    }

    public boolean isInNest() {
        return isInNest;
    }

    public boolean isOutOfGame() {
        return isOutOfGame;
    }

    public void putBackInNest(Piece pieces) {
        Ludo.getInstance().putInNest(pieces, getLag());
        isInNest = true;

    }
}
