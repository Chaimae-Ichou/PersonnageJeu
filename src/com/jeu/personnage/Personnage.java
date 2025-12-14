package com.jeu.personnage;


public class Personnage {
    public int index = 0;
    public String[] orientations = {"NORD", "EST", "SUD", "OUEST"};

    public String tourner(int fois) {
        index = (index + fois) % 4;
        return orientations[index];
    }
}



