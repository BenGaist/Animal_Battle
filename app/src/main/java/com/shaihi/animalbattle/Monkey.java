package com.shaihi.animalbattle;

public class Monkey extends Animal{
    public Monkey() {
        super(5);
    }

    @Override
    public String battle(Animal other) {
        if (this.strength > other.getStrength())
        {
            return "win";
        }
        if (this.strength == other.getStrength())
        {
            return "tie";
        }
        else
        {
            return "lose";
        }
    }
}
