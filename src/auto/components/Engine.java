package auto.components;

public class Engine {
    private boolean isWork;

    public Engine() {
        this.isWork = true;
    }

    public void setInstalled(boolean installed) {
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        this.isWork = work;
    }
}
