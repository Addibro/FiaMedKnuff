package com.fiamedknuff;

import java.util.*;

public class Ludo {

    // Four Nests
    private Nest blue;
    private Nest yellow;
    private Nest green;
    private Nest red;
    static final int PIECES_PER_NEST = 4;

    // 60 Rutor
    private Square rutor;

    // how to represent the board game
    private LinkedList<Square> squares;

    private static Ludo instance = null;

    // Singleton
    private Ludo() {
        blue = new Nest(Team.BLUE, new HashSet<>());
        yellow = new Nest(Team.YELLOW, new HashSet<>());
        green = new Nest((Team.GREEN), new HashSet<>());
        red = new Nest(Team.RED, new HashSet<>());
        populateNests();
    }

    private void populateNests() {
        for (int i = 0; i < PIECES_PER_NEST; i++) {
            blue.addPjäs(Arrays.asList(new Piece(Team.BLUE)));
            yellow.addPjäs(Arrays.asList(new Piece(Team.YELLOW)));
            green.addPjäs(Arrays.asList(new Piece(Team.GREEN)));
            red.addPjäs(Arrays.asList(new Piece(Team.RED)));
        }
    }

    public static Ludo getInstance() {
        if (instance == null) {
            instance = new Ludo();
        }
        return instance;
    }

    public Nest getBlue() {
        return blue;
    }

    public Nest getYellow() {
        return yellow;
    }

    public Nest getGreen() {
        return green;
    }

    public Nest getRed() {
        return red;
    }

    public void putInNest(Collection<Piece> pjäser, Team lag) {
        switch (lag) {
            case RED:
                red.addPjäs(pjäser);
                break;
            case BLUE:
                blue.addPjäs(pjäser);
                break;
            case GREEN:
                green.addPjäs(pjäser);
                break;
            case YELLOW:
                yellow.addPjäs(pjäser);
        }
    }

    // Nested classes
    class Square {

        private Square framför; // en ruta kan ha en annan ruta framför sig
        private Square höger; // varje ruta innan de färgkodade rutorna har en ruta till höger

        private Collection<Piece> pieces;

        Square() {
            pieces = null;
        }

        public Collection<Piece> getPieces() {
            return pieces;
        }

        public void removePiece() {
            if (pieces != null) {
                pieces.clear();
            }
        }

        // Can only add one Piece at the time to each square
        public void addPjäs(Piece piece) {
            pieces.add(piece);
        }
    }

    class Nest {
        private Team lag;
        private Collection<Piece> pieces;

        public Nest(Team lag, Collection<Piece> pieces) {
            this.lag = lag;
            this.pieces = pieces;
        }

        public void addPjäs(Collection<Piece> pieces) {
            this.pieces = pieces;
        }

        public Collection<Piece> getPieces() {
            return pieces;
        }

        public Team getLag() {
            return lag;
        }
    }

    static enum Team {
        BLUE,
        GREEN,
        YELLOW,
        RED
    }
}
