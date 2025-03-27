import java.util.ArrayList;

public class Character {
    protected int level;
    protected int HP;
    protected int strength;
    protected int dexterity;
    protected int constitution;
    protected int intelligence;
    protected int wisdom;
    protected int charisma;
    protected String name;
    protected ArrayList<String> feats = new ArrayList<String>();

    public Character(int level, int HP, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, String name, ArrayList feats) {
        this.level = level;
        this.HP = HP;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.name = name;
        this.feats = feats;

    }

    public void calcHP() {
        HP = HP + (level-1) * (6 + constitution);
    }

    public void calcAC(int AC) {
        AC = 10 + dexterity;
    }

    public void levelUp(int level, int AC) {
        level = level+1;
        calcHP();
        calcAC(AC);
    }

    public void addFeat(ArrayList feats, String feat) {
        feats.add(feat);
    }
}
