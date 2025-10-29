package com.pluralsight;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class WizardTest {

    @Test
    void setName() {
        //arrange
        Wizard prince = new Wizard("Prince", "Slytherin", 800);
        String name = "prince";
        //act
        prince.setName(name);
        //assert
        assertEquals(name, prince.getName());
    }

    @Test
    void getHouse() {
        //arrange
        Wizard saint = new Wizard("Saint", "Slytherin", 1200);
        String house = "Slytherin";
        //act
        saint.setHouse(house);
        //assert
        assertEquals(house, saint.getHouse());
    }

    @Test
    void setPowerLevel() {
        //arrange
        Wizard aina = new Wizard("Aina", "Gryffindor", 500);
        int powerLevel = 500;
        //act
        aina.setPowerLevel(powerLevel);
        //assert
        assertEquals(powerLevel, aina.getPowerLevel());
    }
    @Test
    void decreasePowerLevel() {
        //arrange
        Wizard saint = new Wizard("Saint", "Slytherin", 1200);
        int powerLevel = 200;
        //act
        saint.setPowerLevel(powerLevel);
        //assert
        assertEquals(powerLevel, saint.getPowerLevel());
    }

    @Test
    void getWandType() {
        //arrange
        Wizard prince = new Wizard("Prince", "Slytherin", 800);
        String wandType = "Dope Wand";
        //act
        prince.setWandType(wandType);
        //assert
        assertEquals(wandType, prince.getWandType());
    }

    @Test
    void castSpell() {
        //arrange
        Wizard prince = new Wizard("Prince", "Slytherin", 800);
        String spell = "Expelliarmus";
        String expectedSpell = "Prince casts the spell Expelliarmus";
        //act
        String result = prince.castSpell(spell);
        //assert
        assertEquals(expectedSpell, result);
    }
}