package com.pluralsight;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Wizard prince = new Wizard("Prince", "Slytherin", 800);
        prince.setName("Prince");
        prince.setHouse("Slytherin");
        System.out.println(prince.castSpell("Avadacadabra"));
        Wizard saint = new Wizard("Saint", "Slytherin", 1200);
        saint.setName("Saint");
        saint.setHouse("Slytherin");
        System.out.println(saint.castSpell("Avadacadabra"));
        Wizard aina = new Wizard("Aina", "Gryffindor", 500);
        aina.setName("Aina");
        aina.setHouse("Gryffindor");
        System.out.println(aina.castSpell("Expelliarmus"));
        Wizard.welcomeMessage();
        prince.setWand(new Wand("wood", "marble", 10));
        //"prince's wand is made up of wood and has a marble core"
        System.out.println("Prince has a " + prince.getWand());
        saint.setWand(new Wand("charcoal", "ember", 12));
        //"saint's wand is made of charcoal and has an ember core"
        System.out.println("Saint has a " + saint.getWand());
        aina.setWand(new Wand("phoenix skin", "diamond", 8));
        //"aina's wand is made of phoenix skin and has a diamond core"
        System.out.println("Aina has a " + aina.getWand());

        ArrayList<Wizard> wizards = new ArrayList<>();
        Wizard prince2 = new Wizard("Prince", "Slytherin", 800);
        prince2.setName("prince");
        prince2.setWand(new Wand("wood", "marble", 10));
        Wizard saint2 = new Wizard("Saint", "Slytherin", 1200);
        saint2.setName("saint");
        saint2.setWand(new Wand("charcoal", "ember", 12));
        Wizard aina2 = new Wizard("Aina", "Gryffindor", 500);
        aina2.setName("aina");
        aina2.setWand(new Wand("phoenix skin", "diamond", 8));
        wizards.add(prince2);
        wizards.add(saint2);
        wizards.add(aina2);
        for (Wizard w : wizards) {
            System.out.println(w.getName() + " has a " + w.getWand().getWood() + " wand");
        }

        Professor mcGonagall = new Professor("mcGonagall", "Gryffindor", 800, "Potions");
        System.out.println(mcGonagall.castSpell("avadacadabra"));
        Professor snape = new Professor("Snape", "Slytherin", 1500, "Defense");
        System.out.println(snape.castSpell("Expelliarmus"));

        Wizard wizard = new Wizard("Harry", "Gryffindor", 1500);
        System.out.println(wizard.castSpell("Expectopetronem"));
        Wizard professor = new Wizard("McGonagall", "Gryffindor", 800);
        System.out.println(professor.castSpell("Expelliarmus"));
        Wizard darkWizard = new Wizard("Voldemort", "Slytherin", 5000);
        System.out.println(darkWizard.castSpell("Avadacadabra"));

        ArrayList<Wizard> wizards2 = new ArrayList<>();
        wizards2.add(new Wizard("Harry", "Gryffindor", 1500));
        wizards2.add(new DarkWizard("Voldemort", "Slytherin", 5000));
        wizards2.add(new Professor("McGonagall", "Gryffindor", 800, "Potions"));
        wizards2.add(new Wizard("Prince", "Slytherin", 1200));
        wizards2.add(new Professor("Snape", "Slytherin", 1500, "Defense"));

        for (Wizard w : wizards2) {
            System.out.println(w.castSpell("Avadacadabra"));

            if (w instanceof Professor) {
                Professor p = (Professor) w;
                System.out.println(p.getSubject());
            }

            if (w instanceof DarkWizard) {
                DarkWizard dw = (DarkWizard) w;
                System.out.println("⚠️ Use caution! Dark wizard detected!");
            }

            if (w instanceof Wizard) {
                Wizard dw = (Wizard) w;
                System.out.println("Regular wizard encountered");
            }

                }
            }}
            //Create an ArrayList of Wizard type that contains different wizard types (Wizard, Professor, DarkWizard). Add at least 5-6 different wizards to the list. Loop through them and call their overridden methods. Notice how each behaves differently — that's polymorphism in action!

