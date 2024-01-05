package auto.components;

public class Roof {
    private boolean installed;
    private boolean isUp;

    public Roof() {
    }

    public boolean isInstalled() {
        return installed;
    }

    public void setInstalled(boolean installed) {
        this.installed = installed;
    }
    public boolean isUp() {
        return isUp;
    }

    public void setUp(boolean is) {
        isUp = is;
    }
}
