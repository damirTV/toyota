package auto.types;

import auto.components.CruiseControl;

/**
 * Создается абстрактный класс PassengerCar, т.к. нельзя создать машину "легковая машина",
 * всегда создается только конкретная модель легковой машины
 */
public abstract class PassengerCar extends Car {
    private CruiseControl cruiseControl;

    public PassengerCar() {
        super();
    }

    public void setCruiseControl(CruiseControl cruiseControl) {
        this.cruiseControl = cruiseControl;
        cruiseControl.setInstalled(true);
    }

    @Override
    public void enableCruiseControl() {
        if (!cruiseControl.isWork()) {
            cruiseControl.setWork(true);
            System.out.println("Круиз контроль включен");
        } else {
            System.out.println("Круиз контроль уже включен");
        }
    }

    @Override
    public void disableCruiseControl() {
        if (cruiseControl.isWork()) {
            cruiseControl.setWork(false);
            System.out.println("Круиз контроль выключен");
        } else {
            System.out.println("Круиз контроль не включен");
        }
    }
}
