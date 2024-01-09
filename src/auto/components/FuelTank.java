package auto.components;

public class FuelTank {
    private double fuelQTY;
    private boolean isWork;

    public FuelTank() {
        this.isWork = true;
    }

    public double getFuelQTY() {
        return fuelQTY;
    }

    public void setFuelQTY(double fuelQTY) {
        this.fuelQTY = fuelQTY;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }
}

