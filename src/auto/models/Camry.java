package auto.models;

import auto.types.PassengerCar;

public class Camry extends PassengerCar {
    private boolean isUSB;

    public Camry() {
        super(17);
        this.isUSB = true;
    }
}
