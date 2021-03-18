package lesson1;

public class Wall implements Barrier {

    private long height;

    public Wall(long height) {
        this.height = height;
    }

    public long getHeight() {

        return height;
    }

    @Override
    public boolean overcomingBarriers(Parameters parameters) {

        String res = "";
        if (this.height <= parameters.getHeightJump()) {
            res = parameters.getName() + " перепрыгнул.";
            System.out.println(res);
            return true;
        } else {
            res += parameters.getName() + " не перепрыгнул.";
            System.out.println(res);
            return false;

        }

    }
}