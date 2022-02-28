package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    private int physAtt;

    public Warrior() {
        super(0.8,0);
        physAtt = 30;
    }

    @Override
    public String toString() {
        return "Warrior{"+super.getHealth()+"}";
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth((int) (hero.getHealth()-physAtt*(1-hero.getPhysDef())));
        if(hero.getHealth() < 0)
            hero.setHealth(0);
    }

}
