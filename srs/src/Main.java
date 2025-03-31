// Madison Bloom
// Date Created: 3/27/25
// Last Updated: 3/31/25
// Title: Dungeons and Dragons Character Subclass

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = scan.nextLine();
    Character player = new Character(1, name, "None");
    Character playerBarb = new Barbarian(1, name, "Barbarian");
    player.ToString();
    playerBarb.ToString();
    // Asks the user for their name then creates a regular
    // character without a class and a barbarian test class
    }
}

