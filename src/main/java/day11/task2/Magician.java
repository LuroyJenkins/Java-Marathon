package day11.task2;

public class Magician extends Hero implements MagicAttack {
    private int magicAtt;

    public Magician() {
        super();
        magicAtt = 20;
        physAtt = 5;
        magicDef = 0.8;
        physDef = 0;
    }

    @Override
    public String toString() {
        return "Magician{"+super.getHealth()+"}";
    }

    @Override
    public void magicalAttack(Hero hero) {
        if(hero.getHealth()-magicAtt*(1-hero.getMagicDef()) < MIN_HEALTH)
            hero.setHealth(MIN_HEALTH);
        else hero.setHealth((int) (hero.getHealth()-magicAtt*(1-hero.getMagicDef())));
    }
}
