package auto;

public class Camry extends Car {
    private boolean isUSB;

    public Camry(String color, String transmission) {
        super("Красный", "Робот", 17);
        this.isUSB = true;
    }
}
