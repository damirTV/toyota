package auto.components;

public class Wheel {
    private boolean isWork;
    private final int diameter;
    private boolean installed;

    public Wheel(int diameter) {
        this.diameter = diameter;
    }

    public boolean isInstalled() {
        return installed;
    }

    public void setInstalled(boolean installed) {
        this.installed = installed;
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
