package auto.components;

public class Engine {
    private boolean isWork;
    private boolean installed;

    public Engine() {
    }

    public boolean isInstalled() {
        return installed;
    }

    public void setInstalled(boolean installed) {
        this.installed = installed;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        this.isWork = work;
    }
}
