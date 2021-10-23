package homework.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите имя персонажа 1: ");
        String name1 = scan.next();

        System.out.println("Введите имя персонажа 2: ");
        String name2 = scan.next();

        Character character1 = new Character(name1);
        Character character2 = new Character(name2);

        Fight.fight(character1,character2);

    }
}


