package auto.components;

public class Usb {
    private boolean isWork;

    public Usb() {
        this.isWork = true;
    }

    public void setWork(boolean status) {
        isWork = status;
    }

    public boolean isWork() {
        return isWork;
    }
}
