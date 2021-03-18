package lesson1;

public class Check {

    public static void main(String[] args) {

        System.out.println("Задание № 1");
        Man man = new Man("Джо", 45, 2);
        Cat cat = new Cat("Том", 13, 3);
        Robot robot = new Robot("Валли", 45, 10);

        man.run();
        man.jump();
        cat.run();
        cat.jump();
        robot.run();
        robot.jump();

        System.out.println("Задание № 2");
        Runningtrack runningtrack = new Runningtrack(11);
        Wall wall = new Wall(5);
        runningtrack.overcomingBarriers(man);
        runningtrack.overcomingBarriers(cat);
        runningtrack.overcomingBarriers(robot);
        wall.overcomingBarriers(man);
        wall.overcomingBarriers(cat);
        wall.overcomingBarriers(robot);

        System.out.println("Задание № 3 и 4");
        Parameters[] sportsmen = {man, cat, robot};
        Barrier[] barriers;
        barriers = new Barrier[]{runningtrack, wall};
        for (Parameters sportsman : sportsmen) {
            for (Barrier barrier : barriers) {

                if (barrier.overcomingBarriers(sportsman)) continue;
                else System.out.println(sportsman.getName() + " снят с соревнований!");
                break;
            }

        }
        }

    }
