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

        Professor mcGonagall = new Professor("mcGonagall", "Gryffindor",800, "Potions");
        mcGonagall.setName("mcGonagall");
        System.out.println(mcGonagall.teachSpell("avadacadabra"));
        Professor snape = new Professor("Snape", "Slytherin", 1500, "Defense");
        System.out.println(snape.teachSpell("Expelliarmus"));
    }
}
