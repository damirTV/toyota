package auto.types;

public class PassengerCar extends Car {
    private boolean isCruiseControl;

    public PassengerCar(int diameter) {
        super(diameter);
    }

    public void cruiseControlOn() {
        isCruiseControl = true;
        System.out.println("Круиз-контроль включен");
    }

    public void cruiseControlOff() {
        isCruiseControl = false;
        System.out.println("Круиз-контроль выключен");
    }
}
