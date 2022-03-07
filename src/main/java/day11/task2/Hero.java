package day11.task2;

public abstract class Hero implements PhysAttack {
    protected final int MIN_HEALTH = 0;
    protected final int MAX_HEALTH = 100;
    private int health;
    protected int physAtt;
    protected double physDef, magicDef;

    public Hero() {
        health = 100;
    }

    public void physicalAttack(Hero hero){
        if(hero.getHealth()-physAtt*(1-hero.getPhysDef()) < MIN_HEALTH)
            hero.setHealth(MIN_HEALTH);
        else hero.setHealth((int) (hero.getHealth()-physAtt*(1-hero.getPhysDef())));
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
