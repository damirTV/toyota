package auto.components;

public class PowerSocket {
    private boolean isWork;

    public PowerSocket() {
        this.isWork = true;
    }

    public void setInstalled(boolean installed) {
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }
}
