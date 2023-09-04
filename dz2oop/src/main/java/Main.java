import difficulty.Mill;
import difficulty.Obstacle;
import difficulty.Track;
import participants.*;

import java.util.ArrayList;

import static java.util.Arrays.asList;

/**
 * Домашнее задание на закрепление :
 *
 * 1)Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса но есть общий класс родитель.
 * Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
 * 2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
 * должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
 * печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
 * (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
 * 3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
 * этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
 * списку он препятствий не идет
 */
public class Main {
    public static void main(String[] args) {

        Entity cat = new Cat("J",100,23);
        Entity human = new Human("Ivan", 500,2);
        Entity robot = new Robot("Terminator",1000000,1000);



        Mill obstacle = new Obstacle(12);
        Mill treck = new Track(450);
        Mill obstacle1 = new Obstacle(22);
        Mill treck1 = new Track(1500);

        ArrayList<Entity> arrayEntity = new ArrayList<>(asList(cat,human,robot));
        ArrayList<Mill> arrayMill = new ArrayList<>(asList(obstacle,obstacle1,treck,treck1));







        for (Entity e: arrayEntity) {
            for (int i = 0; i < arrayMill.size()-1; i++) {
                if(!arrayMill.get(i).doIt(arrayMill.get(i).getObstruction(),e)){
                    i=arrayMill.size();

            }

            }

        }

      }

}




