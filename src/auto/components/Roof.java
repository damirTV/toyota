package auto.components;

public class Roof {
    private boolean isUp;
    private boolean isWork;

    public Roof() {
        this.isWork = true;
    }

    public void setInstalled(boolean installed) {
    }

    public boolean isUp() {
        return isUp;
    }

    public void setUp(boolean is) {
        isUp = is;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }
}
