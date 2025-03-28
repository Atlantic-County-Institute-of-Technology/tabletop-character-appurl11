//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = scan.nextLine();
    Character player = new Character(1,name);
    player.ToString();
    }
}

