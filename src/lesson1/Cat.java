package lesson1;

public class Cat implements Parameters {

    private String name;
    private int speedRun;
    private long heightJump;

    public Cat(String name, int speedRun, long heightJump)

    {
        this.name = name;
        this.speedRun = speedRun;
        this.heightJump = heightJump;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSpeedRun() {
        return speedRun;
    }

    @Override
    public  long getHeightJump() {
        return heightJump;
    }

    @Override
    public int run() {
        System.out.println("Кот " + name + " бежит " + getSpeedRun() + " км/ч ");
        return speedRun;
    }

    @Override
    public long jump() {
        System.out.println("Кот " + name + " прыгает " + getHeightJump() + " км/ч ");
        return heightJump;
    }

}
