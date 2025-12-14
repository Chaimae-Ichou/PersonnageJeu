package com.jeu.personnage;


import org.junit.Test;
import static org.junit.Assert.*;

public class PersonnageTest {

        @Test
       public void testTournerZeroFois() {
            Personnage p = new Personnage();
            String resultat = p.tourner(0);
            System.out.println("Résultat obtenu : " + resultat);
            assertEquals("NORD", resultat);
        }
    @Test
    public void testTournerUneFois() {
        Personnage p = new Personnage();
        String resultat = p.tourner(1);
        System.out.println("Résultat obtenu : " + resultat);
        assertEquals("EST", resultat);
    }
    @Test
    public void testTournerDeuxFois() {
        Personnage p = new Personnage();
        String resultat = p.tourner(2);
        System.out.println("Résultat obtenu : " + resultat);
        assertEquals("SUD", resultat);
    }
    @Test
    public void testTournerTroisFois() {
        Personnage p = new Personnage();
        String resultat = p.tourner(3);
        System.out.println("Résultat obtenu : " + resultat);
        assertEquals("OUEST", resultat);
    }
    @Test
    public void testTournerQuatreFois() {
        Personnage p = new Personnage();
        String resultat = p.tourner(4);
        System.out.println("Résultat obtenu : " + resultat);
        assertEquals("NORD", resultat);
    }
    @Test
    public void testTournerNegatifUneFois() {
        Personnage p = new Personnage();
        String resultat = p.tourner(-1);
        System.out.println("Résultat obtenu : " + resultat);
        assertEquals("OUEST", resultat);
    }

}

