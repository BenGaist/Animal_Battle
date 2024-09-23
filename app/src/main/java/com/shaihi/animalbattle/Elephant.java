package com.shaihi.animalbattle;

public class Elephant extends Animal{
    public Elephant() {
        super(12);
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
//