package com.shaihi.animalbattle;

public class Lion extends Animal{
    public Lion() {
        super(8); // Example strength value for Lion
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
