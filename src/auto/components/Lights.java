package auto.components;

public class Lights {
    private boolean isWork;

    public Lights() {
        this.isWork = true;
    }

    public void setWork(boolean status) {
        isWork = status;
    }

    public boolean isWork() {
        return isWork;
    }
}
