package auto.models;

import auto.components.Usb;
import auto.types.PassengerCar;

public class Camry extends PassengerCar {
    private Usb usb;

    public Camry() {
        super();
    }

    public void setUsb(Usb usb) {
        this.usb = usb;
        usb.setInstalled(true);
    }

    @Override
    public void enableMusic() {
        if (!usb.isWork()) {
            usb.setWork(true);
            System.out.println("Музыка включена");
        } else {
            System.out.println("Порт уже используется");
        }
    }

    @Override
    public void disableMusic() {
        if (usb.isWork()) {
            usb.setWork(false);
            System.out.println("Музыка выключена");
        } else {
            System.out.println("Порт не используется");
        }
    }

    @Override
    public void upRoof() {
    }

    @Override
    public void downRoof() {
    }



    @Override
    public void enableFridge() {
    }

    @Override
    public void disableFridge() {
    }

    @Override
    public void enablePower() {
    }

    @Override
    public void disablePower() {
    }
}
