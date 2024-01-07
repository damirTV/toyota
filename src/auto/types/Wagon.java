package auto.types;

/**
 * Создается абстрактный класс Wagon, т.к. нельзя создать машину "грузовик",
 * всегда создается только конкретная модель грузовика
 */
public abstract class Wagon extends Car {
    private double loadCapacity;

    public Wagon() {
        super();
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public abstract void enablePower();

    public abstract void disablePower();
}
