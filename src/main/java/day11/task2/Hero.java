package day11.task2;

public abstract class Hero {
    private int health;
    private double physDef, magicDef;

    public Hero(double physDef, double magicDef) {
        health = 100;
        this.physDef = physDef;
        this.magicDef = magicDef;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }
}
