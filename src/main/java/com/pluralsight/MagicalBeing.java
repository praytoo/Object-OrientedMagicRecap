package com.pluralsight;

public abstract class MagicalBeing {

    public abstract void useMagic();

    public void introduce(){
        System.out.println("I am a magical being");
    }
    //Create an abstract class MagicalBeing with:
    //
    //An abstract method useMagic()
    //A concrete method introduce() that prints "I am a magical being"
    //Make Wizard, Professor, and DarkWizard extend MagicalBeing instead of each other (restructure your inheritance). Each class should implement useMagic() differently:
    //
    //Wizards use magic for learning
    //Professors use magic for teaching
    //Dark wizards use magic for dark purposes
    //Create a list of MagicalBeing objects, add various types, and call useMagic() for each.
}
