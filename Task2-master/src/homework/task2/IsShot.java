package homework.task2;


public class IsShot {
    public static void shot(Character o1, Character o2) {
        if (o1.superpower <= 5){
        if (o1.health > 0 && o2.health > 0) {
            if (o2.luck < o1.accuracy) {
                o2.health -= o1.attack_damage;
                System.out.println("Стреляет игрок " + o1.name + " #" + "\n Здоровье игрока "
                        + o2.name + ": " + o2.health);
                o1.superpower ++;
                System.out.println(o1.superpower);
            } else {
                o1.accuracy += 1;
            }
        }
    }else{
            System.out.println("Игрок " + o1.name +  " применил супер способность, уроон увеличен х2"
                    + "\n Здоровье игрока " + o2.name + ": " + o2.health);
            o2.health -= o1.attack_damage * 2;
            o1.superpower = 0;
            System.out.println(o1.superpower);
        }
    }

}
