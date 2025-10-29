package com.pluralsight;

public class Wizard {
    private String name;
    private String house;
    private int powerLevel;
    private String wandType;
    static String school = "Hogwarts";
    private Wand wand;

    public Wizard(String name, String house, int powerLevel) {
        this.name = name;
        this.house = house;
        this.powerLevel = powerLevel;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public String castSpell(String spell){
        return getName() + " casts the spell " + spell;
    }

    static void welcomeMessage(){
        System.out.println("Welcome to " + school + "School of Witchcraft and Wizardry!");
    }

    //The total number of students currently enrolled at Hogwarts - static
    //A wizard's name - non-static
    //A spell counter that tracks the total spells cast by all wizards combined - static
    //A spell counter that tracks each individual wizard's spells - non-static
    //A method that calculates an individual wizard's power level based on their experience - static
    //A method that prints the Hogwarts school motto (same for everyone) - static
    //The Sorting Hat's list of all four houses - static
    //The temperature at which a specific potion is currently brewing - non-static
    //The name of the current headmaster of Hogwarts - static
    //The specific spell a wizard is currently casting - non-static
}
