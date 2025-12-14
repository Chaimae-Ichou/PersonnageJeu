package com.jeu.personnage;

public enum Orientation {
    NORD, EST, SUD, OUEST;

    private static final Orientation[] VALEURS = values();

    public Orientation tourner(int quartsDeTour) {
        int nouvelIndex = Math.floorMod(this.ordinal() + quartsDeTour, VALEURS.length);
        return VALEURS[nouvelIndex];
}

}
