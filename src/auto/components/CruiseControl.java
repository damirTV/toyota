package auto.components;

public class CruiseControl {
    private boolean isWork;

    public CruiseControl() {
        this.isWork = true;
    }

    public void setInstalled(boolean installed) {
    }

    public void setWork(boolean status) {
        isWork = status;
    }

    public boolean isWork() {
        return isWork;
    }
}
