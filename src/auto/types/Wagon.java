package auto.types;

public class Wagon extends Car {
    private int loadCapacity;

    public Wagon(int diameter) {
        super(diameter);
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
