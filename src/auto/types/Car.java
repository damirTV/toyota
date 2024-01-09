package auto.types;

import auto.components.*;
import auto.exceptions.StartCarException;
import auto.manufacture.Country;

/**
 * Создается абстрактный класс Car, т.к. нельзя создать просто машину,
 * всегда создается только конкретная модель машины
 */
public abstract class Car {
    private String model;
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
        String error = "";
        if (!wheels[0].isWork() && !wheels[1].isWork()
                && !wheels[2].isWork() && !wheels[3].isWork()) {
            error = "Ошибка: проколото колеса";
        } else if (fuelTank.getFuelQTY() <= 0) {
            error = error + "Ошибка: пустой бензобак";
        } else if (!electric.isWork()) {
            error = error + "Ошибка: электрика неисправна";
        } else if (!engine.isWork()) {
            error = error + "Ошибка: двигатель неисправен";
        } else {
            isDrive = true;
            System.out.println("Машина едет");
        }
        throw new StartCarException(error);
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
        wheels[1] = wheelFR;
        wheels[2] = wheelRF;
        wheels[3] = wheelRR;
    }

    public void changeWheels(int wheel1, int wheel2) {
        if (wheels[wheel1].getDiameter() == wheels[wheel2].getDiameter()) {
            Wheel clone = wheels[wheel1];
            wheels[wheel1] = wheels[wheel2];
            wheels[wheel2] = clone;
        } else {
            System.out.println("Диаметры колес разные");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
    }

    public void fillFuel(double fuelQTY) {
        fuelTank.setFuelQTY(fuelQTY);
        System.out.println("Топливный бак заправлен на: " + fuelQTY);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Electric getElectric() {
        return electric;
    }

    public void setElectric(Electric electric) {
        this.electric = electric;
    }

    public void setLights(Lights lights) {
        this.lights = lights;
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

    public abstract void enableCruiseControl();

    public abstract void disableCruiseControl();

    public abstract void upRoof();

    public abstract void downRoof();

    public abstract void enableMusic();

    public abstract void disableMusic();

    public abstract void enableFridge();

    public abstract void disableFridge();

    public abstract void enablePower();

    public abstract void disablePower();
}
