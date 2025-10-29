package com.pluralsight;

public class Wand {
    private String wood;
    private String core;
    private double length;

    @Override
    public String toString() {
        return "Wand{" +
                "wood='" + wood + '\'' +
                ", core='" + core + '\'' +
                ", length=" + length +
                '}';
    }

    public Wand(String wood, String core, double length) {
        this.wood = wood;
        this.core = core;
        this.length = length;
    }

    public String getWood() {
        return wood;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

}
