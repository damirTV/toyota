package auto.components;

public class Fridge {
    private boolean installed;
    private boolean isWork;

    public Fridge() {
    }

    public boolean isInstalled() {
        return installed;
    }

    public void setInstalled(boolean installed) {
        this.installed = installed;
    }

    public void setWork(boolean status) {
        isWork = status;
    }

    public boolean isWork() {
        return isWork;
    }
}
