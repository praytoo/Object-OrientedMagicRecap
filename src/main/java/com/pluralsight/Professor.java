package com.pluralsight;

public class Professor extends MagicalBeing{
    public Professor(String name, String house, int powerLevel, String subject) {
        super(name, house, powerLevel);
        this.subject = subject;
    }

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String castSpell(String spell) {
        return getName() + " teaches you the educational spell: " + spell;
    }

    public void useMagic(){

    }
}
