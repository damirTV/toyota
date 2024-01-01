package auto.components;

public class Wheel {
    private boolean isWork = true;
    private int diameter;
    private boolean installed;

    public Wheel(int diameter) {
        this.diameter = diameter;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public boolean isInstalled() {
        return installed;
    }

    public void setInstalled(boolean installed) {
        this.installed = installed;
    }
}
