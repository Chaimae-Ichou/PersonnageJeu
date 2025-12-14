package com.jeu.personnage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonnageTest {

        @Test
        void testTournerZeroFois() {
            Personnage p = new Personnage();
            assertEquals("NORD", p.tourner(0));
        }
    }
}
