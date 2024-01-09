package auto.components;

public class Fridge {
    private boolean isWork;

    public Fridge() {
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
