package auto.manufacture;

import auto.components.*;

public class Factory {
    private Country country;

    public Factory(Country country) {
        this.country = country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public Wheel createWheel(int diameter) {
        Wheel wheel = new Wheel(diameter);
        wheel.setWork(true);
        return wheel;
    }

    public Electric createElectric() {
        Electric electric = new Electric();
        electric.setWork(true);
        return electric;
    }

    public Engine createEngine() {
        Engine engine = new Engine();
        engine.setWork(true);
        return engine;
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
