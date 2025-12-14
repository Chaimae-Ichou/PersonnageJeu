package com.jeu.personnage;


public class Personnage {
    public String tourner(int fois) {
        if (fois == 0) return "NORD";
        if (fois == 1) return "EST";
        if (fois == 2) return "SUD";
        return "NORD";
    }
}


