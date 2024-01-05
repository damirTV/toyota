package auto.types;

import auto.exceptions.StartCarException;
import auto.components.*;
import auto.manufacture.Country;

public class Car {
    private Color color;
    private int maxSpeed;
    private Transmission transmission;
    private boolean isDrive;
    private double price;
    private FuelTank fuelTank;
    private Engine engine;
    private Electric electric;
    private Lights lights;
    private Wheel[] wheels;
    private Country country;

    public Car() {
        this.isDrive = false;
        this.wheels = new Wheel[4];
        this.engine = new Engine();
        this.fuelTank = new FuelTank();
        this.electric = new Electric();
        this.lights = new Lights();
    }

    public void startDrive() throws StartCarException {
        if (wheels[0].isWork() && wheels[1].isWork() && wheels[2].isWork() && wheels[3].isWork()
                && fuelTank.getFuelQTY() > 0 && electric.isWork() && engine.isWork()) {
            isDrive = true;
            System.out.println("Машина едет");
        } else if (fuelTank.getFuelQTY() <= 0) { // TODO - выдавать полный перечень ошибок
            throw new StartCarException("Ошибка: пустой бензобак");
        } else if (!electric.isWork()) {
            throw new StartCarException("Ошибка: электрика неработоспособна");
        } else if (!engine.isWork()) {
            throw new StartCarException("Ошибка: двигатель неисправен");
        } else {
            throw new StartCarException("Ошибка: проколото колесо");
        }
    }

    public void stopDrive() {
        isDrive = false;
        System.out.println("Машина остановилась");
    }

    public void enableLights() {
        if (!lights.isWork()) {
            lights.setWork(true);
            System.out.println("Фары включены");
        } else {
            System.out.println("Фары уже включены");
        }

    }

    public void disableLights() {
        if (lights.isWork()) {
            lights.setWork(false);
            System.out.println("Фары выключены");
        } else  {
            System.out.println("Фары уже выключены");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWheels(Wheel wheelFF, Wheel wheelFR, Wheel wheelRF, Wheel wheelRR) {
        wheels[0] = wheelFF;
        wheels[0].setInstalled(true);
        wheels[1] = wheelFR;
        wheels[1].setInstalled(true);
        wheels[2] = wheelRF;
        wheels[2].setInstalled(true);
        wheels[3] = wheelRR;
        wheels[3].setInstalled(true);
    }

    public void changeWheels(Wheel wheel1, Wheel wheel2) {
        if (wheel1.getDiameter() == wheel2.getDiameter()) {
            Wheel clone = wheel2;
            wheel1 = wheel2;
            wheel2 = clone;
        }
    }

    public Wheel getWheel(int i) {
        return wheels[i];
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
        fuelTank.setInstalled(true);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
        engine.setInstalled(true);
    }

    public Electric getElectric() {
        return electric;
    }

    public void setElectric(Electric electric) {
        this.electric = electric;
        electric.setInstalled(true);
    }

    public void setLights(Lights lights) {
        this.lights = lights;
        lights.setInstalled(true);
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
