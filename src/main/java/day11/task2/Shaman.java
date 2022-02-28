package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private int physAtt, magicAtt;

    public Shaman() {
        super(0.2,0.2);
        physAtt = 10;
        magicAtt = 15;
    }

    @Override
    public String toString() {
        return "Shaman{"+super.getHealth()+"}";
    }

    @Override
    public void healHimself() {
        super.setHealth(getHealth()+25);
        if(super.getHealth() > 100)
            super.setHealth(100);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(getHealth()+10);
        if(hero.getHealth() > 100)
            hero.setHealth(100);
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
