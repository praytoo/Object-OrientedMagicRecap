package com.pluralsight;

public class Professor extends MagicalBeing{
    public Professor(String name, String house, int powerLevel, String subject) {
        this.subject = subject;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

   // @Override
    public String castSpell(String spell) {
        return getName() + " teaches you the educational spell: " + spell;
    }

    public void useMagic(){
        System.out.println("I use magic for teaching");
    }
}
