package com.fiamedknuff;

import java.util.*;

public class Spelplan {

    // Four Nests
    private Nest blue;
    private Nest yellow;
    private Nest green;
    private Nest red;
    static final int PJÄSER_PER_NEST = 4;

    // 60 Rutor
    private Ruta rutor;

    private static Spelplan instance = null;

    // Singleton
    private Spelplan() {
        blue = new Nest(Lag.BLUE, new HashSet<>());
        yellow = new Nest(Lag.YELLOW, new HashSet<>());
        green = new Nest((Lag.GREEN), new HashSet<>());
        red = new Nest(Lag.RED, new HashSet<>());
        populateNests();
    }

    private void populateNests() {
        for (int i = 0; i < PJÄSER_PER_NEST; i++) {
            blue.addPjäs(Arrays.asList(new Pjäs(Lag.BLUE)));
            yellow.addPjäs(Arrays.asList(new Pjäs(Lag.YELLOW)));
            green.addPjäs(Arrays.asList(new Pjäs(Lag.GREEN)));
            red.addPjäs(Arrays.asList(new Pjäs(Lag.RED)));
        }
    }

    public static Spelplan getInstance() {
        if (instance == null) {
            instance = new Spelplan();
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

    public void putInNest(Collection<Pjäs> pjäser, Lag lag) {
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
    class Ruta {

        private Ruta framför; // en ruta kan ha en annan ruta framför sig
        private Ruta höger; // varje ruta innan de färgkodade rutorna har en ruta till höger

        private Collection<Pjäs> pjäser;

        Ruta() {
            pjäser = null;
        }

        public Collection<Pjäs> getPjäser() {
            return pjäser;
        }

        public void removePjäs() {
            if (pjäser != null) {
                pjäser.clear();
            }
        }

        // Can only add one Pjäs at the time to each square
        public void addPjäs(Pjäs pjäs) {
            pjäser.add(pjäs);
        }
    }

    class Nest {
        private Lag lag;
        private Collection<Pjäs> pjäser;

        public Nest(Lag lag, Collection<Pjäs> pjäser) {
            this.lag = lag;
            this.pjäser = pjäser;
        }

        public void addPjäs(Collection<Pjäs> pjäser) {
            this.pjäser = pjäser;
        }

        public Collection<Pjäs> getPjäser() {
            return pjäser;
        }

        public Lag getLag() {
            return lag;
        }
    }

    static enum Lag {
        BLUE,
        GREEN,
        YELLOW,
        RED
    }
}
