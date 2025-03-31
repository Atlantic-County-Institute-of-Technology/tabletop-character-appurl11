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
    protected String charClass;
    protected ArrayList<String> feats = new ArrayList<String>();
    // initializes all the needed values for a character

    public Character(int level, String name, String charClass) {
        this.level = level;
        this.name = name;
        this.charClass = charClass;
        dice();
        calcHP();
        calcAC();
    }
    // defines the basic things every character has and randomizes stats
    // also calculates HP and AC(armor)

    public Character() {
        strength = 10;
        dexterity = 10;
        constitution = 10;
        intelligence = 10;
        wisdom = 10;
        charisma = 10;
        charClass = "None";
    }
    // if the player doesn't pick a class, these are the values they will be given

    public void dice() {
        Random rand = new Random();
        strength = rand.nextInt(3, 18);
        dexterity = rand.nextInt(3, 18);
        constitution = rand.nextInt(3, 18);
        intelligence = rand.nextInt(3, 18);
        wisdom = rand.nextInt(3, 18);
        charisma = rand.nextInt(3, 18);

    }
    // randomizes each stat value from 3, 18

    public void calcHP() {
        if (level == 1) {
            HP = 10 + constitution;
        }
        else {
            HP = HP + (level-1) * (6 + constitution);
        }
    }
    // if the character is level one, hp is 10 + constitution
    // otherwise a specific calculation goes through to calculate the users HP

    public void calcAC() {
        AC = 10 + dexterity;
    }
    // the AC is 10 + the users dexterity

    public void levelUp() {
        level = level+1;
        calcHP();
        calcAC();
    }
    // when the character levels up, recalculate their HP and AC

    public void addFeat(String feat) {
        feats.add(feat);
    }
    // just used to add a feat to the feats arraylist

    public void ToString() {
        System.out.println("Character Name: " + name + " Level: " + level + " Class: " + charClass + "\n" + " HP: " + HP + " | STR: " + strength + "\n DEX: " + dexterity + " | CON: " + constitution + "\n INT: " + intelligence + " | WIS: " + wisdom + " | CHA: " + charisma + "\n Feats: " + feats);
    }
    // prints out the users name, level, class, stats, and feats

}

class Barbarian extends Character {

    public Barbarian(int level, String name, String charClass) {
        super(level, name, charClass);
        strength += strength+2;
        constitution += constitution+1;
        addFeat("Rage");
        addFeat("Unarmored Defense");
    }
    // makes an extended class that is the same as a regular character except their str is +2 and con is +1
    // also defines that classes feats
}