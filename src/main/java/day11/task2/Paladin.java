package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    private int physAtt;

    public Paladin() {
        super(0.5,0.2);
        physAtt = 15;
    }

    @Override
    public String toString() {
        return "Paladin{"+super.getHealth()+"}";
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
    public void physicalAttack(Hero hero) {
        hero.setHealth((int) (hero.getHealth()-physAtt*(1-hero.getPhysDef())));
        if(hero.getHealth() < 0)
            hero.setHealth(0);
    }

}
