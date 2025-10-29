package com.pluralsight;

public class DarkWizard extends MagicalBeing{
    public DarkWizard(String name, String house, int powerLevel) {
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //@Override
    public String castSpell(String spell){
        return getName() + " casts the evil spell: " + spell;
    }

    public void useMagic(){
        System.out.println("I use magic for dark reasons");
    }

}
