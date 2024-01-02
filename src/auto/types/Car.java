package auto.types;

import auto.exceptions.StartCarException;
import auto.components.*;
import auto.manufacture.Country;

public abstract class Car {
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

    public Car(int diameter) {
        this.isDrive = false;
        this.wheels = new Wheel[4];
        wheels[0] = new Wheel(diameter); // TODO - установку колес и диаметра реализовать через конвейер
        wheels[0].setInstalled(true);
        wheels[1] = new Wheel(diameter);
        wheels[1].setInstalled(true);
        wheels[2] = new Wheel(diameter);
        wheels[2].setInstalled(true);
        wheels[3] = new Wheel(diameter);
        wheels[3].setInstalled(true);
        this.engine = new Engine();
        this.fuelTank = new FuelTank();
        this.electric = new Electric();
        this.lights = new Lights();
    }

    public void startDrive() throws StartCarException {
        if (wheels[0].isWork() && wheels[1].isWork() && wheels[2].isWork() && wheels[3].isWork()
                && fuelTank.getFuelQTY() > 0 && electric.isInstalled() && engine.isInstalled()) {
            isDrive = true;
            System.out.println("Машина едет");
        } else if (fuelTank.getFuelQTY() <= 0) {
            throw new StartCarException("Ошибка: пустой бензобак");
        } else if (!electric.isInstalled()) {
            throw new StartCarException("Ошибка: электрика неработоспособна");
        } else if (!engine.isInstalled()) {
            throw new StartCarException("Ошибка: двигатель неисправен");
        } else {
            throw new StartCarException("Ошибка: проколото колесо");
        }
    }

    public void stopDrive() {
        isDrive = false;
        System.out.println("Машина остановилась");
    }

    public void lightsOn() {
        lights.on();
        System.out.println("Фары включены");
    }

    public void lightsOff() {
        lights.off();
        System.out.println("Фары выключены");
    }

    public void getLights() {
        System.out.println("Состояние фар:" + lights);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Wheel[] getWheels() {
        return wheels;
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
}
