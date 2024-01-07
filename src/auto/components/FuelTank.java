package auto.components;

public class FuelTank {
    private double fuelQTY;
    private boolean installed;

    public FuelTank() {
    }

    public boolean isInstalled() {
        return installed;
    }

    public void setInstalled(boolean installed) {
        this.installed = installed;
    }

    public double getFuelQTY() {
        return fuelQTY;
    }

    public void setFuelQTY(double fuelQTY) {
        this.fuelQTY = fuelQTY;
    }
}
