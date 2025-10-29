package com.pluralsight;

public class Professor extends Wizard{
    public Professor(String name, String house, int powerLevel, String subject) {
        super(name, house, powerLevel);
        this.subject = subject;
    }

    private String subject;

    public String teachSpell(String spell) {
        return getName() + " teaches you " + spell;
    }

}
