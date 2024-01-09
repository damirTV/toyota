package auto.components;

public class Wheel {
    private boolean isWork;
    private final int diameter;

    public Wheel(int diameter) {
        this.diameter = diameter;
        this.isWork = true;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        this.isWork = work;
    }

    public int getDiameter() {
        return diameter;
    }
}
