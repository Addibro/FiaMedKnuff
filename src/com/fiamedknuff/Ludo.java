package com.fiamedknuff;

import java.util.*;

public class Ludo {

    // Four Nests
    private Nest blue;
    private Nest yellow;
    private Nest green;
    private Nest red;

    // how to represent the board game
    private Node<Square> squares;

    private static Ludo instance = null;

    // Singleton
    private Ludo() {
        createBoard();
        blue = new Nest(Color.BLUE, new HashSet<>());
        yellow = new Nest(Color.YELLOW, new HashSet<>());
        green = new Nest((Color.GREEN), new HashSet<>());
        red = new Nest(Color.RED, new HashSet<>());
        populateNests();
    }

    private void createBoard() {
        for ()
    }

    private void populateNests() {
        for (int i = 0; i < 4; i++) {
            blue.addPiece(new Piece(Color.BLUE));
            yellow.addPiece(new Piece(Color.YELLOW));
            green.addPiece(new Piece(Color.GREEN));
            red.addPiece(new Piece(Color.RED));
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

    public void putInNest(Piece piece, Color color) {
        switch (color) {
            case RED:
                red.addPiece(piece);
                break;
            case BLUE:
                blue.addPiece(piece);
                break;
            case GREEN:
                green.addPiece(piece);
                break;
            case YELLOW:
                yellow.addPiece(piece);
        }
    }

    // Nested classes
    class Square {

        private Collection<Piece> pieces;

        Square() {
            pieces = null;
        }

        public Collection<Piece> getPieces() {
            return pieces;
        }

        public boolean pushPiece(Piece piece) {
            return pieces.contains(piece) && pieces.remove(piece);
        }

        // Can only add one Piece at the time to each square
        public void addPiece(Piece piece) {
            pieces.add(piece);
        }

        public void removePieces() {
            if (pieces != null) {
                pieces.clear();
            }
        }
    }

    class Nest {
        private Color color;
        private Collection<Piece> pieces;

        Nest(Color color, Collection<Piece> pieces) {
            this.color = color;
            this.pieces = pieces;
        }

        public void addPiece(Piece piece) {
            this.pieces.add(piece);
        }

        public Collection<Piece> getPieces() {
            return pieces;
        }

        public Color getColor() {
            return color;
        }
    }

    enum Color {
        BLUE,
        GREEN,
        YELLOW,
        RED
    }
}
