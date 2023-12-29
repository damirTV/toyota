package auto;

public class Lights {
    private boolean isWork;

    public Lights(boolean isWork) {
        this.isWork = isWork;
    }

    public boolean isWork() {
        return isWork;
    }

    public void on() {
        isWork = true;
    }

    public void off() {
        isWork = false;
    }
}
