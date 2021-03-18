package lesson1;

public class Man implements Parameters {

    private String name;
    private int speedRun;
    private long heightJump;

    public Man(String name, int speedRun, long heightJump)

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
        System.out.println("Человек " + name + " бежит " + getSpeedRun() + " км/ч ");
        return speedRun;
    }

    @Override
    public long jump() {
        System.out.println("Человек " + name + " прыгает " + getHeightJump() + " км/ч ");
        return heightJump;
    }

}
