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

}

