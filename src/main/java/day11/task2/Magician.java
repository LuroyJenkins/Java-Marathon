package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack {
    private int physAtt, magicAtt;

    public Magician() {
        super(0,0.8);
        physAtt = 5;
        magicAtt = 20;
    }

    @Override
    public String toString() {
        return "Magician{"+super.getHealth()+"}";
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth((int) (hero.getHealth()-magicAtt*(1-hero.getMagicDef())));
        if(hero.getHealth() < 0)
            hero.setHealth(0);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth((int) (hero.getHealth()-physAtt*(1-hero.getPhysDef())));
        if(hero.getHealth() < 0)
            hero.setHealth(0);
    }
}
