package auto.types;

import auto.components.CruiseControl;

public class PassengerCar extends Car {
    private CruiseControl cruiseControl;

    public PassengerCar() {
        super();
    }

    public void setCruiseControl(CruiseControl cruiseControl) {
        this.cruiseControl = cruiseControl;
        cruiseControl.setInstalled(true);
    }

    public String enableCruiseControl() {
        if (!cruiseControl.isWork()) {
            cruiseControl.setWork(true);
            return "Круиз контроль включен";
        } else {
            return "Круиз контроль уже включен";
        }
    }


    public String disableCruiseControl() {
        if (cruiseControl.isWork())
        {
            cruiseControl.setWork(false);
            return "Круиз контроль выключен";
        } else {
            return "Круиз контроль не включен";
        }
    }
}
