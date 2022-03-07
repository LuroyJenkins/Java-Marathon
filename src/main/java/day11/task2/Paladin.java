package day11.task2;

public class Paladin extends Hero implements Healer {

    public Paladin() {
        super();
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    @Override
    public String toString() {
        return "Paladin{"+super.getHealth()+"}";
    }

    @Override
    public void healHimself() {
        if(getHealth()+25 > MAX_HEALTH)
            setHealth(MAX_HEALTH);
        else setHealth(getHealth()+25);
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.getHealth()+10 > MAX_HEALTH)
            hero.setHealth(MAX_HEALTH);
        else hero.setHealth(getHealth()+10);
    }
}
