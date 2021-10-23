package homework.task2;

public class Fight {
    public static void fight(Character o1, Character o2){

        boolean isShot = true;
        while (o1.health > 0 || o2.health > 0){
            if (!isShot){
                IsShot.shot(o1,o2);
                isShot = true;
            }else {
                IsShot.shot(o2,o1);
                isShot = false;
            }

        }
    }
}
