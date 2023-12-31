package auto.manufacture;

import auto.components.*;

public class Factory {
    private final Country country;

    public Factory(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public Wheel createWheel(int diameter) {
        return new Wheel(diameter);
    }

    public Electric createElectric() {
        return new Electric();
    }

    public Engine createEngine() {
        return new Engine();
    }

    public Color createColor(Color color) {
        return color;
    }

    public FuelTank createFuelTank() {
        FuelTank fuelTank = new FuelTank();
        fuelTank.setFuelQTY(0);
        return fuelTank;
    }

    public Lights createLights() {
        return new Lights();
    }

    public Transmission createTransmission(Transmission transmission) {
        return transmission;
    }

    public Fridge createFidge() {
        return new Fridge();
    }

    public Usb createUsb() {
        return new Usb();
    }


    public PowerSocket createPowerSocket() {
        return new PowerSocket();
    }

    public CruiseControl createCruiseControl() {
        return new CruiseControl();
    }

    public Roof createRoof() {
        return new Roof();
    }
}
