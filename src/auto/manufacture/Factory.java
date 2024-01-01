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

    public Electric createElectric() {
        Electric electric = new Electric();
        electric.setInstalled(true);
        return electric;
    }

    public Engine createEngine() {
        Engine engine = new Engine();
        engine.setInstalled(true);
        return engine;
    }

    public Color createColor(Color color) {
        return color;
    }

    public FuelTank createFuelTank() {
        FuelTank fuelTank = new FuelTank();
        fuelTank.setInstalled(true);
        fuelTank.setFuelQTY(0);
        return fuelTank;
    }

    public Lights createLights() {
        Lights lights = new Lights();
        lights.setInstalled(true);
        return lights;
    }

    public Transmission createTransmission(Transmission transmission) {
        return transmission;
    }
}
