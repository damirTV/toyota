package auto.components;

public class FuelTank {
    private int fuelQTY;
    private boolean installed;

    public FuelTank() {
    }

    public boolean isInstalled() {
        return installed;
    }

    public void setInstalled(boolean installed) {
        this.installed = installed;
    }

    public int getFuelQTY() {
        return fuelQTY;
    }

    public void setFuelQTY(int fuelQTY) {
        this.fuelQTY = fuelQTY;
    }
}
