import java.util.ArrayList;
import java.util.Random;

public class Character {
    protected int level;
    protected int HP;
    protected int AC;
    protected int strength;
    protected int dexterity;
    protected int constitution;
    protected int intelligence;
    protected int wisdom;
    protected int charisma;
    protected String name;
    protected ArrayList<String> feats = new ArrayList<String>();

    public Character(int level, String name) {
        this.level = level;
        this.name = name;
        dice();
        calcHP();
        calcAC();
    }

    public Character() {
        strength = 10;
        dexterity = 10;
        constitution = 10;
        intelligence = 10;
        wisdom = 10;
        charisma = 10;


    }

    public void dice() {
        Random rand = new Random();
        strength = rand.nextInt(3, 18);
        dexterity = rand.nextInt(3, 18);
        constitution = rand.nextInt(3, 18);
        intelligence = rand.nextInt(3, 18);
        wisdom = rand.nextInt(3, 18);
        charisma = rand.nextInt(3, 18);

    }

    public void calcHP() {
        if (level == 1) {
            HP = 10 + constitution;
        }
        else {
            HP = HP + (level-1) * (6 + constitution);
        }
    }

    public void calcAC() {
        AC = 10 + dexterity;
    }

    public void levelUp() {
        level = level+1;
        calcHP();
        calcAC();
    }

    public void addFeat(ArrayList feats, String feat) {
        feats.add(feat);
    }

    public void ToString() {
        System.out.println("Character Name: " + name + " Level: " + level + " Class: " + "placeholder \n" + " HP: " + HP + " | STR: " + strength + "\n DEX: " + dexterity + " | CON: " + constitution + "\n INT: " + intelligence + " | WIS: " + wisdom + " | CHA: " + charisma + "\n Feats: " + feats);
    }

}