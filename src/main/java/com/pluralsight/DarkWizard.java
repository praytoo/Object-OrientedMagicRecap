package com.pluralsight;

public class DarkWizard extends MagicalBeing{
    public DarkWizard(String name, String house, int powerLevel) {
        super(name, house, powerLevel);
    }

    @Override
    public String castSpell(String spell){
        return getName() + " casts the evil spell: " + spell;
    }

    public void useMagic(){

    }

}
