package auto.components;

public class Lights {
    private boolean installed;
    private boolean status;

    public Lights() {
    }

    public boolean isInstalled() {
        return installed;
    }

    public void setInstalled(boolean installed) {
        this.installed = installed;
    }

    public void on() {
        status = true;
    }

    public void off() {
        status = false;
    }
}
