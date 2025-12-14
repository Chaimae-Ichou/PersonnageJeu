package com.jeu.personnage;


public class Personnage {
    private Orientation orientation = Orientation.NORD;

    public String tourner(int quartsDeTour) {
        orientation = orientation.tourner(quartsDeTour);
        return orientation.name();
}

}



