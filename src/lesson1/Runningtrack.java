package lesson1;

public class Runningtrack implements Barrier {

private int speed;

public Runningtrack (int speed) { this.speed = speed; }

public int getSpeed() { return speed; }

@Override
    public boolean overcomingBarriers (Parameters parameters) {

    if (this.speed <= parameters.getSpeedRun()) {

        System.out.println(parameters.getName() + " пробежал.");
        return true;
    } else {

        System.out.println(parameters.getName() + " не пробежал.");
        return false;

    }

}

}
