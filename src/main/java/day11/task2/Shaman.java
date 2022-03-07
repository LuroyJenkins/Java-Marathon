package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    private int magicAtt;

    public Shaman() {
        super();
        magicAtt = 15;
        physAtt = 10;
        magicDef = 0.2;
        physDef = 0.2;
    }

    @Override
    public String toString() {
        return "Shaman{"+super.getHealth()+"}";
    }

    @Override
    public void healHimself() {
        if(getHealth()+50 > MAX_HEALTH)
            setHealth(MAX_HEALTH);
        else setHealth(getHealth()+50);
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.getHealth()+30 > MAX_HEALTH)
            hero.setHealth(MAX_HEALTH);
        else hero.setHealth(getHealth()+30);
    }

    @Override
    public void magicalAttack(Hero hero) {
        if(hero.getHealth()-magicAtt*(1-hero.getMagicDef()) < MIN_HEALTH)
            hero.setHealth(MIN_HEALTH);
        else hero.setHealth((int) (hero.getHealth()-magicAtt*(1-hero.getMagicDef())));
    }
}
