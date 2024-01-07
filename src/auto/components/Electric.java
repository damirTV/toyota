package auto.components;

public class Electric {
    private boolean isWork;
    private boolean installed;

    public Electric() {
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
