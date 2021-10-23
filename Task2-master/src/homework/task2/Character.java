package homework.task2;

public class Character {
    int health,luck,accuracy, attack_damage, recharge;
    int superpower = 0;
    int shot;
    String name;

    public int getShot(){
        return attack_damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int a = 1;
    int b = 10;

    public Character( String name) {

        int random_number1 = a + (int) (Math.random() * b); // Генерация 1 числа
        int random_number2 = a  + (int) (Math.random() * b); // Генерация 2 числа
        this.health = 100;
        this.luck = random_number2;
        this.accuracy = random_number1;
        this.attack_damage = random_number2;
        this.name = name;
        this.superpower = superpower;
        this.recharge = 1;
        System.out.println("Характеристики вашего персонажа: Здоровье - " + health + ", Удача - " + luck +
                ", меткость - " + accuracy + ", урон - " + attack_damage);
    }


    @Override
    public String toString() {
        return "Здоровье игрока " + name+ ": " + health;
    }
}
